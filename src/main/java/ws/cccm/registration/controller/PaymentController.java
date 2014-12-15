package ws.cccm.registration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import ws.cccm.registration.service.NotificationService;
import ws.cccm.registration.service.PaymentManager;

@Controller
public class PaymentController {

    private static final Logger logger = Logger.getLogger(PaymentController.class);
//    private JmsEmailSender mailSender = null;
    private String templateName = null;
    private MessageSource messageSource = null;
    @Autowired
    private PaymentManager paymentManager;
    @Autowired
    private NotificationService notificationService;

//    /**
//     * @param mailEngine the mailEngine to set
//     */
//    public void setMailEngine(MailEngine mailEngine) {
//        this.mailEngine = mailEngine;
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

    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {

        String itemId = request.getParameter("item_number");
        logger.info("item_number:" + itemId);
        String custom = request.getParameter("custom");
        logger.info("custom:" + custom);
        logger.debug(request.getParameterNames());
        logger.debug(request.getAttributeNames());
        ModelAndView model = new ModelAndView("confirm");
        
        
        model.addObject("registrationId", itemId);
        model.addObject("amountPaid", custom);
        
        return model;

    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String onSubmit(@RequestParam("item_number") String itemId,
//            BindingResult result, 
//            SessionStatus status) {
//
//        Payment payment = new Payment();
//        logger.info("item_number:" + itemId);
//        logger.info("custom:" + custom);
//        if (custom != null) {
//
//            StringTokenizer st = new StringTokenizer(custom, "|");
//
//            // Extract payment type
//            if (st.hasMoreTokens()) {
//                // Obtain payment type
//                String paymentType = st.nextToken();
//                if (paymentType.equalsIgnoreCase("check")) {
//                    payment.setPersonalCheck(new Boolean(true));
//                } else if (paymentType.equalsIgnoreCase("paypal")) {
//                    payment.setCreditCard(new Boolean(true));
//                } else {
//                    payment.setPersonalCheck(new Boolean(false));
//                    payment.setCreditCard(new Boolean(false));
//                }
//            }
//            // Extract payment amount
//            if (st.hasMoreTokens()) {
//                String paymentAmount = st.nextToken();
//                payment.setAmount(Double.valueOf(paymentAmount));
//            } else {
//                payment.setAmount(0.0);
//            }
//            // Extract registration number
//            if (itemId != null) {
//                payment.setRegistrationID(Long.valueOf(itemId));
//            } else {
//                payment.setRegistrationID(0L);
//            }
//
//
//            if (payment.getRegistrationID() > 0 && payment.getAmount() > 0.0) {
//                paymentManager.save(payment);
//            }
//            model.addAttribute("registrationId", itemId);
//            status.setComplete();
//        }
//        return "confirm";
//    }
//    @RequestMapping(method = RequestMethod.GET)
//    public String setupForm(@RequestParam("item_number") String itemId,
//            @RequestParam("custom") String custom,
//            ModelMap model) {
//
//        Payment payment = new Payment();
//        logger.info("item_number:" + itemId);
//        logger.info("custom:" + custom);
//        if (custom != null) {
//
//            StringTokenizer st = new StringTokenizer(custom, "|");
//
//            // Extract payment type
//            if (st.hasMoreTokens()) {
//                // Obtain payment type
//                String paymentType = st.nextToken();
//                if (paymentType.equalsIgnoreCase("check")) {
//                    payment.setPersonalCheck(new Boolean(true));
//                } else if (paymentType.equalsIgnoreCase("paypal")) {
//                    payment.setCreditCard(new Boolean(true));
//                } else {
//                    payment.setPersonalCheck(new Boolean(false));
//                    payment.setCreditCard(new Boolean(false));
//                }
//            }
//            // Extract payment amount
//            if (st.hasMoreTokens()) {
//                String paymentAmount = st.nextToken();
//                payment.setAmount(Double.valueOf(paymentAmount));
//            } else {
//                payment.setAmount(0.0);
//            }
//            // Extract registration number
//            if (itemId != null) {
//                payment.setRegistrationID(Long.valueOf(itemId));
//            } else {
//                payment.setRegistrationID(0L);
//            }
//
//
//            if (payment.getRegistrationID() > 0 && payment.getAmount() > 0.0) {
//                paymentManager.save(payment);
//            }
//
//            model.addAttribute("registrationId", itemId);
//
//        }
//        return "confirm";
//    }
    /**
     * @param paymentManager
     */
    public void setPaymentManager(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }
}
