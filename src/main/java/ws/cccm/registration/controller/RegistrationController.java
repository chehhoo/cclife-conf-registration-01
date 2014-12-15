package ws.cccm.registration.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import ws.cccm.application.model.LabelValue;
import ws.cccm.application.model.Payment;
import ws.cccm.application.model.Paypal;
import ws.cccm.application.model.Registration;
import ws.cccm.application.util.StringUtil;
import ws.cccm.registration.service.JpaRegistrationServiceImpl;
import ws.cccm.registration.service.PaymentManager;
import ws.cccm.registration.utils.RegistrationAssessment;
import ws.cccm.registration.utils.SearchCriteria;

@Controller
public class RegistrationController {

    private static final Logger logger = Logger.getLogger(RegistrationController.class);
//    private JmsEmailSender mailSender = null;
    private String templateName = null;
    private MessageSource messageSource = null;
//    @Autowired
    private PaymentManager paymentManager = null;
    private JpaRegistrationServiceImpl registrationService = null;

    /**
     * @param mailEngine the mailEngine to set
     */
//    public void setMailSender(JmsEmailSender mailSender) {
//        this.mailSender = mailSender;
//    }
    /**
     * @param templateName the templateName to set
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * @param messageSource the messageSource to set
     */
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

//    @RequestMapping(value="review.htm", method = RequestMethod.POST)
    @RequestMapping("/review.htm")
    public ModelAndView onSubmit(@ModelAttribute("criteria") SearchCriteria criteria, BindingResult result, SessionStatus status) {

        logger.info("Entering on submit... ");

        ModelAndView model = null;

        if (validateLookupCriteria(criteria) || validateLookupByIdCriteria(criteria)) {

            List<Registration> list = registrationService.findRegistrationByCriteria(criteria);
            List<Long> duplicate = null;

            if (list.isEmpty()) {
                model = new ModelAndView("notFound");
            } else if ((duplicate = findDuplicateRegistration(list)).size() > 1) {
                model = new ModelAndView("duplicate");
                model.addObject("duplicateList", duplicate);
            } else {

                RegistrationAssessment assessment = registrationService.getRegistrationAssessment(list);

                Paypal payObj = registrationService.createPaypalRequest(assessment);

                if (assessment.getRegistrationID() != null && assessment.getRegistrationID().longValue() > 0) {
                    Payment payment = null;
                    String statement = null;
                    payment = paymentManager.getPaymentRecordByRegistrationID(assessment.getRegistrationID().longValue());
                    if (payment == null) {
                        statement = "No payment infomation";
                    } else if (payment.getCreditCard() == true && payment.getPaymentDate() != null) {
                        statement = "Credit card payment $" + payment.getAmount() + " is received. Thank you.";
                    } else if (payment.getPersonalCheck() == true && payment.getPaymentDate() != null) {
                        statement = "Personal Check payment $" + payment.getAmount() + " is received. Thank you.";
                    } else {
                        statement = "No payment infomation";
                    }

                    assessment.setPaymentStatus(statement);
                }
                logger.info("online lookup" + assessment.getRegistrationID());
                model = new ModelAndView("review");
                model.addObject("registrationList", list);
                model.addObject("assessment", assessment);
                model.addObject("payObj", payObj);
            }
        } else {
            // no valid entry
            model = new ModelAndView("invalid");
        }

        return model;
    }
//    @RequestMapping(value="lookup.htm", method = RequestMethod.GET)

    @RequestMapping("lookup.htm")
    public String setupForm(ModelMap model) {

        logger.info("Entering setup lookup form... ");
        SearchCriteria criteria = new SearchCriteria();

        criteria.setHomePhone("9999911111");
        criteria.setHomeZipCode("99999");

        model.addAttribute("criteria", criteria);


        return "lookup";
    }

    @RequestMapping("lookupById.htm")
    public String lookupById(ModelMap model) {

        logger.info("Entering setup lookupById form... ");
        SearchCriteria criteria = new SearchCriteria();

        model.addAttribute("criteria", criteria);

        return "lookupById";
    }

    private boolean validateLookupCriteria(SearchCriteria criteria) {

        if (criteria.getHomePhone().isEmpty() || criteria.getHomeZipCode().isEmpty()) {
            return false;
        }

        if (!StringUtil.isNumeric(criteria.getHomeZipCode())) {
            return false;
        }

        return true;
    }

    private boolean validateLookupByIdCriteria(SearchCriteria criteria) {

        if (criteria.getRegistrationId().isEmpty()) {
            return false;
        }

        if (!StringUtil.isNumeric(criteria.getRegistrationId())) {
            return false;
        }

        return true;
    }

    private List<Long> findDuplicateRegistration(List<Registration> list) {
        Iterator<Registration> iter = list.iterator();
        ArrayList<Long> dupBucket = new ArrayList<Long>();

        while (iter.hasNext()) {

            Registration registration = iter.next();
            LabelValue dup = null;

            if (registration.getFormID() != null && registration.getFormID().intValue() > 0) {
                Long regId = registration.getFormID().longValue();

                if (!dupBucket.contains(regId)) {
                    dupBucket.add(regId);
                }
            }
        }
        return dupBucket;
    }

    /**
     * @param paymentDao the paymentDao to set
     */
    public void setPaymentManager(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }

    /**
     * @param registrationService the registrationService to set
     */
    public void setRegistrationService(JpaRegistrationServiceImpl registrationService) {
        this.registrationService = registrationService;
    }
}
