/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ws.cccm.registration.service;

import java.util.List;
import ws.cccm.application.model.BaseObject;
import com.cclife.registration.domain.Consent;
import com.cclife.registration.domain.Fee;
import ws.cccm.application.model.Registration;
/**
 *
 * @author ch1choo1
 */
public interface RegistrationService {

    public boolean submit(BaseObject obj) throws Exception;
    public List<Registration> findRegistrationes(String familyId);
    public Fee calculateFee(String familyId) ;
    public Registration findRegistrationById(Long id);
    public List<Consent> findConsents(String familyId);
}
