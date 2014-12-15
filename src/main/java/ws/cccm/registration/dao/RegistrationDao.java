/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ws.cccm.registration.dao;

import java.util.List;
import ws.cccm.application.model.Registration;

/**
 *
 * @author ch1choo1
 */

/**
 * @author CH1JMOH2
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public interface RegistrationDao extends GenericDao<Registration, Long> {

    List<Registration> findRegistrationByQuery(String query);
    
}