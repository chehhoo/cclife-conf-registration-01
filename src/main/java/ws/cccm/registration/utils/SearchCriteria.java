package ws.cccm.registration.utils;

import java.io.Serializable;


/**
 * A backing bean for the main hotel search form. Encapsulates the criteria needed to perform a hotel search.
 * 
 * It is expected a future milestone of Spring Web Flow 2.0 will allow flow-scoped beans like this one to hold
 * references to transient services that are restored automatically when the flow is resumed on subsequent requests.
 * This would allow this SearchCriteria object to delegate to the {@link BookingService} directly, for example,
 * eliminating the need for the actions in {@link MainActions}.
 */
public class SearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The user-provided search criteria for finding Hotels.
     */
    private String searchString = "" ;
    private String homePhone = "" ;
    private String homeZipCode = "" ;
    private String registrationId = "" ;
            
    /**
     * The maximum page size of the Hotel result list
     */
    private int pageSize;

    /**
     * The current page of the Hotel result list.
     */
    private int page;

    public String getSearchString() {
	return searchString;
    }

    public void setSearchString(String searchString) {
	this.searchString = searchString;
    }

    public int getPageSize() {
	return pageSize;
    }

    public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
    }

    public int getPage() {
	return page;
    }

    public void setPage(int page) {
	this.page = page;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @param homeZipCode the homeZipCode to set
     */
    public void setHomeZipCode(String homeZipCode) {
        this.homeZipCode = homeZipCode;
    }

    /**
     * @param registrationId the registrationId to set
     */
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @return the homeZipCode
     */
    public String getHomeZipCode() {
        return homeZipCode;
    }

    /**
     * @return the registrationId
     */
    public String getRegistrationId() {
        return registrationId;
    }
}