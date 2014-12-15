package ws.cccm.registration.service;

import java.util.List;
import ws.cccm.application.model.BaseObject;
import ws.cccm.application.model.Payment;
import ws.cccm.registration.dao.PaymentDao;

public class PaymentReceivedManager implements PaymentManager {

    private PaymentDao paymentDao;

    public void setPaymentDao(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public Payment getPaymentRecord(long id) {
        return (Payment) paymentDao.findById(id);
    }

    @Override
    public Payment getPaymentRecordByRegistrationID(long id) {
        String searchString = "select p from Payment p where p.registrationID = " + id + "";
        List<BaseObject> list = paymentDao.findPaymentByQuery(searchString);

        Payment payment = null;
        
        if ((! list.isEmpty()) && list.get(0) != null) {
            payment = (Payment) list.get(0);

        }
        return payment;
    }

    @Override
    public void save(Payment payment) {
        paymentDao.save(payment);
    }
}
