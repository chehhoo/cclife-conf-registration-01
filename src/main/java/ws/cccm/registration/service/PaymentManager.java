package ws.cccm.registration.service;

import ws.cccm.application.model.Payment;

public interface PaymentManager {
    public Payment getPaymentRecord(long id);
    public Payment getPaymentRecordByRegistrationID(long id) ;
    public void save(Payment payment) ;
    
    
}
