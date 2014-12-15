package ws.cccm.registration.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ws.cccm.application.model.Payment;
import ws.cccm.registration.service.NotificationService;
import ws.cccm.registration.service.PaymentManager;

@Controller
public class NotificationController {

    private static final Logger logger = Logger.getLogger(NotificationController.class);

    @Autowired
    private PaymentManager paymentManager;
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private String paypalUrl ;

    @RequestMapping("/instantPaymentNotification.htm")
    public void handleRequest(HttpServletRequest request)
            throws Exception {

        //1. Read all posted request parameters
        String requestParams = this.getAllRequestParams(request);
        logger.info(requestParams);

        //2. Prepare 'notify-validate' command with exactly the same parameters
        Enumeration en = request.getParameterNames();
        StringBuilder cmd = new StringBuilder("cmd=_notify-validate");
        String paramName;
        String paramValue;
        while (en.hasMoreElements()) {
            paramName = (String) en.nextElement();
            paramValue = request.getParameter(paramName);
            cmd.append("&").append(paramName).append("=")
                    .append(URLEncoder.encode(paramValue, request.getParameter("charset")));
        }

        //3. Post above command to Paypal IPN URL {@link IpnConfig#ipnUrl}
        URL u = new URL(paypalUrl + "/cgi-bin/webscr");
        HttpsURLConnection uc = (HttpsURLConnection) u.openConnection();
        uc.setDoOutput(true);
        uc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        uc.setRequestProperty("Host", "www.paypal.com");
        PrintWriter pw = new PrintWriter(uc.getOutputStream());
        pw.println(cmd.toString());
        pw.close();

        //4. Read response from Paypal
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String res = in.readLine();
        in.close();

        logger.debug("instantPaymentNotification.htm start..");
        String itemName = request.getParameter("item_name");
        String itemNumber = request.getParameter("item_number");
        String paymentStatus = request.getParameter("payment_status");
        String paymentAmount = request.getParameter("mc_gross");
        String paymentCurrency = request.getParameter("mc_currency");
        String txnId = request.getParameter("txn_id");
        String receiverEmail = request.getParameter("receiver_email");
        String payerEmail = request.getParameter("payer_email");

        logger.debug("Item Name:" + itemName);
        logger.debug("item Number:" + itemNumber);
        logger.debug("payment Status:" + paymentStatus);
        logger.debug("payment Amount:" + paymentAmount);
        logger.debug("payment Currency:" + paymentCurrency);
        logger.debug("receiver Email:" + receiverEmail);
        logger.debug("payer Email:" + payerEmail);

        //6. Validate captured Paypal IPN Information
        if (res.equals("VERIFIED")) {
            logger.debug("VERIFIED");

            Payment payment = new Payment();
            if (paymentAmount != null) {
                payment.setAmount(Double.valueOf(paymentAmount));
            } else {
                payment.setAmount(0.0);
            }

            // Extract registration number
            if (itemNumber != null) {
                payment.setRegistrationID(Long.valueOf(itemNumber));
            } else {
                payment.setRegistrationID(0L);
            }
            Date now = new Date();
            payment.setPaymentDate(now);
            payment.setCreditCard(Boolean.TRUE);

            if (payment.getRegistrationID() > 0 && payment.getAmount() >= 0.0) {
                logger.info("Saving payment:" + payment.toString());
                paymentManager.save(payment);
            }

            notificationService.sendPaymentConfirmationWithEmail(payment, "");
        }
    }

    private String getAllRequestParams(HttpServletRequest request) {
        Map map = request.getParameterMap();
        StringBuilder sb = new StringBuilder("\nREQUEST PARAMETERS\n");
        for (Iterator it = map.keySet().iterator(); it.hasNext();) {
            String pn = (String) it.next();
            sb.append(pn).append("\n");
            String[] pvs = (String[]) map.get(pn);
            for (int i = 0; i < pvs.length; i++) {
                String pv = pvs[i];
                sb.append("\t").append(pv).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * @param paymentManager
     */
    public void setPaymentManager(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }

}
