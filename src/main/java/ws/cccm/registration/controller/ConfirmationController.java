package ws.cccm.registration.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ws.cccm.application.model.Payment;
import ws.cccm.registration.service.NotificationService;
import ws.cccm.registration.service.PaymentManager;

@Controller
public class ConfirmationController {

    private static final Logger logger = Logger.getLogger(ConfirmationController.class);

    @Autowired
    private PaymentManager paymentManager;
    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/confirmGrace.htm")
    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {

        String itemId = request.getParameter("item_number");
        logger.info("item_number:" + itemId);
        String custom = request.getParameter("custom");
        logger.info("custom:" + custom);
        logger.debug(request.getParameterNames());
        logger.debug(request.getAttributeNames());
        
        ModelAndView model = new ModelAndView("confirmGrace");
        
        model.addObject("registrationId", itemId);
        model.addObject("amountPaid", custom);

        return model;

    }

    /**
     * @param paymentManager
     */
    public void setPaymentManager(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }
}
