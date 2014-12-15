/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.cccm.registration.dao;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import ws.cccm.application.model.Registration;

/**
 *
 * @author CH1SSHA2
 */
public class JdbcRegistrationDaoImpl implements RegistrationDao {

    private static final Logger logger = Logger.getLogger(JdbcRegistrationDaoImpl.class);
    private JdbcTemplate jdbcTemplate;
    private String INSERT_SQL = "";
    private String SELECT_SQL = "";

    public void setINSERT_SQL(String INSERT_SQL) {
        this.INSERT_SQL = INSERT_SQL;
    }

    public void setSELECT_SQL(String SELECT_SQL) {
        this.SELECT_SQL = SELECT_SQL;
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    public void create(Form form) {
//        logger.info("createRequest entering [" + jdbcTemplate.toString() + "]");
//        logger.debug("Executing :[" + INSERT_SQL + "] [" +
//                reg.getBan() + "] [" +
//                reg.getRequestTimestamp() + "] [" +
//                reg.getRequestTypecode() + "] [" +
//                reg.getVoiceServiceIndicator() + "] [" +
//                reg.getTextServiceIndicator() + "] [" +
//                reg.getMainLineCtn() + "] [" +
//                reg.getNotifyAdditionalCtnInd() + "] [" +
//                reg.getSocLanguageCode() + "] [" +
//                reg.getContactName() + "] [" +
//                reg.getContactPhoneNumber() + "] [" +
//                reg.getComments() + "]");
//        jdbcTemplate.update(INSERT_SQL, new Object[]{reg.getBan(),
//                    reg.getRequestTimestamp(),
//                    reg.getRequestTypecode(),
//                    reg.getVoiceServiceIndicator(),
//                    reg.getTextServiceIndicator(),
//                    reg.getMainLineCtn(),
//                    reg.getNotifyAdditionalCtnInd(),
//                    reg.getSocLanguageCode(),
//                    reg.getContactName(),
//                    reg.getContactPhoneNumber(),
//                    reg.getComments()});
//        logger.info("createRequest exiting");
//    }
    @Override
    public Registration save(Registration reg) {

//        Registration reg = (Registration) obj;
        logger.info(">>>>>>>>>>> createRequest entering [" + jdbcTemplate.toString() + "] Query [" + INSERT_SQL + "]");

        jdbcTemplate.update(INSERT_SQL, new Object[]{
//                    reg.getId(),
                    reg.getAge(),
                    reg.getBreakfast1(),
                    reg.getBreakfast2(),
                    reg.getBreakfast3(),
                    reg.getBreakfast4(),
                    reg.getCellPhone(),
                    reg.getChineseName(),
                    reg.getDinner1(),
                    reg.getDinner2(),
                    reg.getDinner3(),
                    reg.getDinner4(),
                    reg.getEmail(),
                    reg.getFirstName(),
                    reg.getFormID(),
                    reg.getGender(),
                    reg.getHomeCity(),
                    reg.getHomePhone(),
                    reg.getHomeState(),
                    reg.getHomeStreetAddress(),
                    reg.getHomeZipCode(),
                    reg.getLastName(),
                    reg.getLunch1(),
                    reg.getLunch2(),
                    reg.getLunch3(),
                    reg.getLunch4(),
//                    reg.getId(),
                    reg.getRegistrationDate(),
                    reg.getRemarks(),
                    reg.getStatus(),
                    reg.getLanguage(),
                    reg.getChurchID(),
                    reg.getFaith(),
                    reg.getFaithYear(),
                    reg.getSeminar1()
                });

//        logger.info(reg.getId());
        logger.info(reg.getAge());
        logger.info(reg.getBreakfast1());
        logger.info(reg.getBreakfast2());
        logger.info(reg.getBreakfast3());
        logger.info(reg.getBreakfast4());
        logger.info(reg.getCellPhone());
        logger.info(reg.getChineseName());
        logger.info(reg.getDinner1());
        logger.info(reg.getDinner2());
        logger.info(reg.getDinner3());
        logger.info(reg.getDinner4());
        logger.info(reg.getEmail());
        logger.info(reg.getFirstName());
        logger.info(reg.getFormID());
        logger.info(reg.getGender());
        logger.info(reg.getHomeCity());
        logger.info(reg.getHomePhone());
        logger.info(reg.getHomeState());
        logger.info(reg.getHomeStreetAddress());
        logger.info(reg.getHomeZipCode());
        logger.info(reg.getLastName());
        logger.info(reg.getLunch1());
        logger.info(reg.getLunch2());
        logger.info(reg.getLunch3());
        logger.info(reg.getLunch4());
//        logger.info(reg.getId());
        logger.info(reg.getRegistrationDate());
        logger.info(reg.getRemarks());
        logger.info(reg.getStatus());
        logger.info(reg.getLanguage());
        logger.info(reg.getChurchID());
        logger.info(reg.getFaith());
        logger.info(reg.getFaithYear());
        logger.info(reg.getSeminar1());

//                RegistrationID,
//                        age,
//                        breakfast1,
//                        breakfast2,
//                        breakfast3,
//                        cellPhone,
//                        chineseName,
//                        dinner1,
//                        dinner2,
//                        dinner3,
//                        email,
//                        firstName,
//                        formID,
//                        gender,
//                        homeCity,
//                        homePhone,
//                        homeState,
//                        homeStreetAddress,
//                        homeZipCode,
//                        lastName,
//                        lunch1,
//                        lunch2,
//                        lunch3,
//                        personID,
//                        registrationDate,
//                        remarks,
//                        status

        logger.info("createRequest exiting");

        return reg;

    }

    @Override
    public List<Registration> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Registration get(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Registration> getAllDistinct() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Registration> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Registration> findRegistrationByQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
