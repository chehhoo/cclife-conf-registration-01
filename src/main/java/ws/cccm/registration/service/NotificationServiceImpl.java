/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.cccm.registration.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.mail.MessagingException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import com.cclife.registration.domain.Consent;
import com.cclife.registration.domain.Fee;
import com.cclife.registration.domain.Payment;
import ws.cccm.application.model.Registration;
import ws.cccm.application.service.MailEngine;

/**
 *
 * @author CH1CHOO1
 */
@Service("notificationService")
public class NotificationServiceImpl implements NotificationService {

    private static final Logger logger = Logger.getLogger(NotificationServiceImpl.class);
    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private MailEngine mailEngine;
//    private String templateName = null;

    @Override
    public boolean sendPaymentConfirmationWithEmail(Object payment, String template) {

        logger.info("enter sendConfirmationEmail...");

        if (!(payment instanceof Payment)) {
            return false;
        }

        Payment pay = (Payment) payment;

        String familyId = pay.getRegistrationID().toString();

        Fee fee = registrationService.calculateFee(familyId);

        Registration savedReg = null;

        List<Registration> list = registrationService.findRegistrationes(familyId);

        if (list != null && !list.isEmpty()) {
            savedReg = list.get(0);
        }

        if (mailEngine != null && savedReg != null) {

            try {
                logger.debug("Mail Engine:" + mailEngine.toString());
                SimpleMailMessage mailMessage = null;

                mailMessage = new SimpleMailMessage();

                mailMessage.setFrom("registration@cccm.ws");
                mailMessage.setBcc("cheh.cccm@gmail.com");
                mailMessage.setTo(savedReg.getEmail());

                String recipients[] = new String[1];
                recipients[0] = savedReg.getEmail();

                String subject = "CCCC/GRACE 2014 Registration Confirmation";
                mailMessage.setSubject(subject);

                Map<String, Object> m = new HashMap<String, Object>();
                m.put("registrationId", savedReg.getFormID().intValue());
//            m.put("rname", savedReg.getFirstName() + " " + savedReg.getLastName());
//                m.put("rnames", rnames);
                Double mealTotal = fee.getTotalBreakfastFee() + fee.getTotalLunchFee() + fee.getTotalDinnerFee();
                Double registrationTotal = fee.getTotalAdultRegistrationFee() + fee.getTotalNonAdultRegistrationFee();
                Double grandTotal = mealTotal + registrationTotal;

                m.put("gandTotalFee", grandTotal.intValue());
                m.put("totalMealFee", mealTotal.intValue());
                m.put("totalRegFee", registrationTotal.intValue());
                m.put("brFee", (int) fee.getTotalBreakfastFee());
                m.put("luFee", (int)fee.getTotalLunchFee());
                m.put("diFee", (int)fee.getTotalDinnerFee());
                m.put("amountPaid", pay.getAmount().intValue());
                m.put("fsupport", 0);
                m.put("btotal", fee.getBreakfastCount());
                m.put("ltotal", fee.getLunchCount());
                m.put("dtotal", fee.getDinnerCount());
                m.put("atotal", fee.getAdultHeadcount());
                m.put("ntotal", fee.getNonAdultHeadcount());
                m.put("nxtotal", fee.getNonAdultXHeadcount());
                String template1 = "confirmationLetterPayByCC.htm";

                if (savedReg.getEventID().compareTo(201403) == 0) {
                    template1 = "confirmationLetterEng.htm";
                }

                mailEngine.sendMessage(recipients, "registration@cccm.ws", subject, template1, m);
                logger.debug("Message Sent :" + savedReg.getEmail());
            } catch (MessagingException ex) {
                java.util.logging.Logger.getLogger(NotificationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        logger.info("exit sendConfirmationEmail...");

        return true;
    }

    @Override
    public boolean sendConsentFormWithEmail(Object consent, String template) {

        if (!(consent instanceof Consent)) {
            return false;
        }

        Consent c = (Consent) consent;

        Registration savedReg = registrationService.findRegistrationById(c.getPersonID());

        if (mailEngine != null && savedReg != null) {

            try {
                logger.debug("Mail Engine:" + mailEngine.toString());
                SimpleMailMessage mailMessage = null;

                mailMessage = new SimpleMailMessage();

                mailMessage.setFrom("registration@cccm.ws");
                mailMessage.setBcc("cheh.cccm@gmail.com");
                mailMessage.setTo(c.getGuardianEmail());

                String recipients[] = new String[1];
                recipients[0] = c.getGuardianEmail();

                String subject = "CCCC/GRACE 2014 Permission Slip of " + savedReg.getFirstName() + " " + savedReg.getLastName();
                mailMessage.setSubject(subject);

                Map<String, Object> m = new HashMap<String, Object>();
                m.put("registrationId", savedReg.getFormID());

                m.put("childFullName", savedReg.getFirstName() + " " + savedReg.getLastName());
                m.put("guardianFullName", c.getGuardianFullName());
                m.put("guardianPhoneNumber", c.getGuardianPhoneNumber());
                m.put("childFullName", savedReg.getFirstName() + " " + savedReg.getLastName());

                mailEngine.sendMessage(recipients, "registration@cccm.ws", subject, template, m);
                logger.debug("Message Sent :" + savedReg.getEmail());
            } catch (MessagingException ex) {
                java.util.logging.Logger.getLogger(NotificationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        logger.info("exit sendConfirmationEmail...");

        return true;
    }

}
