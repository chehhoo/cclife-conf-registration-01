/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.cccm.registration.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ws.cccm.application.model.Registration;

/**
 *
 * @author CH1CHOO1
 */
@Repository("registrationDao")
public class JpaRegistrationDaoImpl implements RegistrationDao {

    private static final Logger logger = Logger.getLogger(JpaRegistrationDaoImpl.class);
    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Registration> getAll() {
        return entityManager.createQuery(
                "SELECT r FROM Registration r").getResultList();
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    @Override
    public Registration save(Registration registration) {

        logger.info("entering RegistrationDaoImpl:save... ");
//        logger.info(registration.getId());
        logger.info(registration.getAge());
        logger.info(registration.getBreakfast1());
        logger.info(registration.getBreakfast2());
        logger.info(registration.getBreakfast3());
        logger.info(registration.getBreakfast4());
        logger.info(registration.getCellPhone());
        logger.info(registration.getChineseName());
        logger.info(registration.getDinner1());
        logger.info(registration.getDinner2());
        logger.info(registration.getDinner3());
        logger.info(registration.getDinner4());
        logger.info(registration.getEmail());
        logger.info(registration.getFirstName());
        logger.info(registration.getFormID());
        logger.info(registration.getGender());
        logger.info(registration.getHomeCity());
        logger.info(registration.getHomePhone());
        logger.info(registration.getHomeState());
        logger.info(registration.getHomeStreetAddress());
        logger.info(registration.getHomeZipCode());
        logger.info(registration.getLastName());
        logger.info(registration.getLunch1());
        logger.info(registration.getLunch2());
        logger.info(registration.getLunch3());
        logger.info(registration.getLunch4());
//        logger.info(registration.getId());
        logger.info(registration.getRegistrationDate());
        logger.info(registration.getRemarks());
        logger.info(registration.getStatus());
        logger.info(registration.getLanguage());
        logger.info(registration.getChurchID());
        logger.info(registration.getFaith());
        logger.info(registration.getFaithYear());
        logger.info(registration.getSeminar1());
        logger.info(registration.getSeminar());

        try {
            entityManager.persist(registration);

        } catch (DataAccessException e) {
            logger.error("JpaRegistrationDaoImpl save:" + e.getMessage());
        }

        return registration;
    }

    @Transactional(readOnly = true)
    @Override
    public Registration get(Long id) {

        Registration c = entityManager.find(Registration.class, id);

        if (c == null) {
            logger.warn("Uh oh, '" + this.getClass() + "' object with id '" + id + "' not found...");
            throw new ObjectRetrievalFailureException(this.getClass(), id);
        }

        return c;
    }

    @Transactional(readOnly = true)
    @Override
    public boolean exists(Long id) {

        return entityManager.contains(id);
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    @Override
    public void remove(Long id) {
        entityManager.remove(this.get(id));
    }

    @Transactional(readOnly = true)
    @Override
    public List<Registration> getAllDistinct() {
        Collection result = new LinkedHashSet(getAll());
        return new ArrayList(result);
    }

// helpers
    @Override
    public List<Registration> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Registration> findRegistrationByQuery(String query) {
        return entityManager.createQuery(query).getResultList();
    }
}
