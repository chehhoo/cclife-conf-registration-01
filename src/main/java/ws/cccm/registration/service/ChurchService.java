package ws.cccm.registration.service;

import ws.cccm.registration.utils.SearchCriteria;
import java.util.List;
import com.cclife.registration.domain.Church;

/**
 * A service interface for retrieving hotels and bookings from a backing repository. Also supports the ability to cancel
 * a booking.
 */
public interface ChurchService {

    /**
     * Find bookings made by the given user
     * @param username the user's name
     * @return their bookings
     */
    public List<Church> findAllChurches();
    
    public List<Church> findChurches(String username);

    /**
     * Find hotels available for booking by some criteria.
     * @param criteria the search criteria
     * @return a list of hotels meeting the criteria
     */
    public List<Church> findChurches(SearchCriteria criteria);

        /**
     * Create a new, transient hotel booking instance for the given user.
     * @param hotelId the hotelId
     * @param userName the user name
     * @return the new transient booking instance
     */
    public Church createChurch(Church c);

    /**
     * Find hotels by their identifier.
     * @param id the hotel id
     * @return the hotel
     */
    public Church findChurchById(Long id);


}
