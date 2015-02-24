package ws.cccm.registration.service;

import com.cclife.registration.domain.Payment;

public interface PaymentManager {
    public Payment getPaymentRecord(long id);
    public Payment getPaymentRecordByRegistrationID(long id) ;
    public void save(Payment payment) ;
    
    
}
