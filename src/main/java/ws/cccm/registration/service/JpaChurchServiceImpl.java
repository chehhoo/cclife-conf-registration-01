package ws.cccm.registration.service;

import com.cclife.registration.domain.Church;
import ws.cccm.registration.utils.SearchCriteria;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import ws.cccm.registration.dao.ChurchDao;

/**
 * A JPA-based implementation of the Church Service. Delegates to a JPA entity manager to issue data access calls
 * against the backing repository. The EntityManager reference is provided by the managing container (Spring)
 * automatically.
 */
public class JpaChurchServiceImpl implements ChurchService {

    private ChurchDao churchDao;

    public void setChurchDao(ChurchDao dao) {
        this.churchDao = dao;
    }

    public JpaChurchServiceImpl() {
    }

    @Override
    public List<Church> findChurches(String username) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Church> findChurches(SearchCriteria criteria) {
        String pattern = getSearchPattern(criteria);
        return churchDao.findChurchesByQuery("select c from Church c where lower(c.churchNameEng) like " + pattern + " or lower(c.city) like " + pattern
                + " or lower(c.zip) like " + pattern + " or lower(c.region) like " + pattern);
    }

    @Override
    public Church createChurch(Church c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Church findChurchById(Long id) {
        return churchDao.get(id);
    }
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<Church> findChurches(String cname) {
//        if (cname != null) {
//            return em.createQuery("select c from Church c where c.acronym = :acronym order by b.checkinDate").setParameter("acronym", cname).getResultList();
//        } else {
//            return null;
//        }
//    }
//
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<Church> findChurches(SearchCriteria criteria) {
//
//        return churchDao.findByNamedQuery(pattern, null)
//
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public Church createChurch(Church c) {
//        return churchDao.save(c);
//     }
//
//    @Transactional(readOnly = true)
//    @Override
//    public Church findChurchById(Long id) {
//        return em.find(Church.class, id);
//    }
//
    // helpers
    private String getSearchPattern(SearchCriteria criteria) {
        if (StringUtils.hasText(criteria.getSearchString())) {
            return "'%" + criteria.getSearchString().toLowerCase().replace('*', '%') + "%'";
        } else {
            return "'%'";
        }
    }

    @Override
    public List<Church> findAllChurches() {
        return churchDao.getAll();
    }
}
