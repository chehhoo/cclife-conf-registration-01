/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.cccm.application.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CH1CHOO1
 */
@Entity
@Table(name = "registration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registration.findAll", query = "SELECT r FROM Registration r"),
    @NamedQuery(name = "Registration.findByRegistrationID", query = "SELECT r FROM Registration r WHERE r.registrationID = :registrationID"),
    @NamedQuery(name = "Registration.findByAge", query = "SELECT r FROM Registration r WHERE r.age = :age"),
    @NamedQuery(name = "Registration.findByBreakfast1", query = "SELECT r FROM Registration r WHERE r.breakfast1 = :breakfast1"),
    @NamedQuery(name = "Registration.findByBreakfast2", query = "SELECT r FROM Registration r WHERE r.breakfast2 = :breakfast2"),
    @NamedQuery(name = "Registration.findByBreakfast3", query = "SELECT r FROM Registration r WHERE r.breakfast3 = :breakfast3"),
    @NamedQuery(name = "Registration.findByBreakfast4", query = "SELECT r FROM Registration r WHERE r.breakfast4 = :breakfast4"),
    @NamedQuery(name = "Registration.findByBreakfast5", query = "SELECT r FROM Registration r WHERE r.breakfast5 = :breakfast5"),
    @NamedQuery(name = "Registration.findByCellPhone", query = "SELECT r FROM Registration r WHERE r.cellPhone = :cellPhone"),
    @NamedQuery(name = "Registration.findByCheckIn", query = "SELECT r FROM Registration r WHERE r.checkIn = :checkIn"),
    @NamedQuery(name = "Registration.findByChineseName", query = "SELECT r FROM Registration r WHERE r.chineseName = :chineseName"),
    @NamedQuery(name = "Registration.findByChurchCity", query = "SELECT r FROM Registration r WHERE r.churchCity = :churchCity"),
    @NamedQuery(name = "Registration.findByChurchID", query = "SELECT r FROM Registration r WHERE r.churchID = :churchID"),
    @NamedQuery(name = "Registration.findByChurchName", query = "SELECT r FROM Registration r WHERE r.churchName = :churchName"),
    @NamedQuery(name = "Registration.findByChurchState", query = "SELECT r FROM Registration r WHERE r.churchState = :churchState"),
    @NamedQuery(name = "Registration.findByCoordinator", query = "SELECT r FROM Registration r WHERE r.coordinator = :coordinator"),
    @NamedQuery(name = "Registration.findByDinner1", query = "SELECT r FROM Registration r WHERE r.dinner1 = :dinner1"),
    @NamedQuery(name = "Registration.findByDinner2", query = "SELECT r FROM Registration r WHERE r.dinner2 = :dinner2"),
    @NamedQuery(name = "Registration.findByDinner3", query = "SELECT r FROM Registration r WHERE r.dinner3 = :dinner3"),
    @NamedQuery(name = "Registration.findByDinner4", query = "SELECT r FROM Registration r WHERE r.dinner4 = :dinner4"),
    @NamedQuery(name = "Registration.findByDinner5", query = "SELECT r FROM Registration r WHERE r.dinner5 = :dinner5"),
    @NamedQuery(name = "Registration.findByDiscount", query = "SELECT r FROM Registration r WHERE r.discount = :discount"),
    @NamedQuery(name = "Registration.findByEmail", query = "SELECT r FROM Registration r WHERE r.email = :email"),
    @NamedQuery(name = "Registration.findByEventID", query = "SELECT r FROM Registration r WHERE r.eventID = :eventID"),
    @NamedQuery(name = "Registration.findByFaith", query = "SELECT r FROM Registration r WHERE r.faith = :faith"),
    @NamedQuery(name = "Registration.findByFaithYear", query = "SELECT r FROM Registration r WHERE r.faithYear = :faithYear"),
    @NamedQuery(name = "Registration.findByFirstName", query = "SELECT r FROM Registration r WHERE r.firstName = :firstName"),
    @NamedQuery(name = "Registration.findByFormID", query = "SELECT r FROM Registration r WHERE r.formID = :formID"),
    @NamedQuery(name = "Registration.findByGender", query = "SELECT r FROM Registration r WHERE r.gender = :gender"),
    @NamedQuery(name = "Registration.findByGroupName", query = "SELECT r FROM Registration r WHERE r.groupName = :groupName"),
    @NamedQuery(name = "Registration.findByHomeCity", query = "SELECT r FROM Registration r WHERE r.homeCity = :homeCity"),
    @NamedQuery(name = "Registration.findByHomePhone", query = "SELECT r FROM Registration r WHERE r.homePhone = :homePhone"),
    @NamedQuery(name = "Registration.findByHomeState", query = "SELECT r FROM Registration r WHERE r.homeState = :homeState"),
    @NamedQuery(name = "Registration.findByHomeStreetAddress", query = "SELECT r FROM Registration r WHERE r.homeStreetAddress = :homeStreetAddress"),
    @NamedQuery(name = "Registration.findByHomeZipCode", query = "SELECT r FROM Registration r WHERE r.homeZipCode = :homeZipCode"),
    @NamedQuery(name = "Registration.findByLanguage", query = "SELECT r FROM Registration r WHERE r.language = :language"),
    @NamedQuery(name = "Registration.findByLastName", query = "SELECT r FROM Registration r WHERE r.lastName = :lastName"),
    @NamedQuery(name = "Registration.findByLodging1", query = "SELECT r FROM Registration r WHERE r.lodging1 = :lodging1"),
    @NamedQuery(name = "Registration.findByLodging2", query = "SELECT r FROM Registration r WHERE r.lodging2 = :lodging2"),
    @NamedQuery(name = "Registration.findByLodging3", query = "SELECT r FROM Registration r WHERE r.lodging3 = :lodging3"),
    @NamedQuery(name = "Registration.findByLodging4", query = "SELECT r FROM Registration r WHERE r.lodging4 = :lodging4"),
    @NamedQuery(name = "Registration.findByLunch1", query = "SELECT r FROM Registration r WHERE r.lunch1 = :lunch1"),
    @NamedQuery(name = "Registration.findByLunch2", query = "SELECT r FROM Registration r WHERE r.lunch2 = :lunch2"),
    @NamedQuery(name = "Registration.findByLunch3", query = "SELECT r FROM Registration r WHERE r.lunch3 = :lunch3"),
    @NamedQuery(name = "Registration.findByLunch4", query = "SELECT r FROM Registration r WHERE r.lunch4 = :lunch4"),
    @NamedQuery(name = "Registration.findByLunch5", query = "SELECT r FROM Registration r WHERE r.lunch5 = :lunch5"),
    @NamedQuery(name = "Registration.findByMisc1", query = "SELECT r FROM Registration r WHERE r.misc1 = :misc1"),
    @NamedQuery(name = "Registration.findByMisc2", query = "SELECT r FROM Registration r WHERE r.misc2 = :misc2"),
    @NamedQuery(name = "Registration.findByMondayPartTime", query = "SELECT r FROM Registration r WHERE r.mondayPartTime = :mondayPartTime"),
    @NamedQuery(name = "Registration.findByNameTag", query = "SELECT r FROM Registration r WHERE r.nameTag = :nameTag"),
    @NamedQuery(name = "Registration.findByPersonID", query = "SELECT r FROM Registration r WHERE r.personID = :personID"),
    @NamedQuery(name = "Registration.findByRegistrationDate", query = "SELECT r FROM Registration r WHERE r.registrationDate = :registrationDate"),
    @NamedQuery(name = "Registration.findByRelationship", query = "SELECT r FROM Registration r WHERE r.relationship = :relationship"),
    @NamedQuery(name = "Registration.findByRemarks", query = "SELECT r FROM Registration r WHERE r.remarks = :remarks"),
    @NamedQuery(name = "Registration.findBySaturdayPartTime", query = "SELECT r FROM Registration r WHERE r.saturdayPartTime = :saturdayPartTime"),
    @NamedQuery(name = "Registration.findBySeeker", query = "SELECT r FROM Registration r WHERE r.seeker = :seeker"),
    @NamedQuery(name = "Registration.findBySeminar", query = "SELECT r FROM Registration r WHERE r.seminar = :seminar"),
    @NamedQuery(name = "Registration.findBySeminar1", query = "SELECT r FROM Registration r WHERE r.seminar1 = :seminar1"),
    @NamedQuery(name = "Registration.findBySeminar2", query = "SELECT r FROM Registration r WHERE r.seminar2 = :seminar2"),
    @NamedQuery(name = "Registration.findBySeminar3", query = "SELECT r FROM Registration r WHERE r.seminar3 = :seminar3"),
    @NamedQuery(name = "Registration.findByStatus", query = "SELECT r FROM Registration r WHERE r.status = :status"),
    @NamedQuery(name = "Registration.findBySundayPartTime", query = "SELECT r FROM Registration r WHERE r.sundayPartTime = :sundayPartTime")})
public class Registration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "RegistrationID")
    private Long registrationID;
    @Column(name = "age",length=5)
    private String age;
    @Column(name = "breakfast1")
    private Integer breakfast1;
    @Column(name = "breakfast2")
    private Integer breakfast2;
    @Column(name = "breakfast3")
    private Integer breakfast3;
    @Column(name = "breakfast4")
    private Integer breakfast4;
    @Column(name = "breakfast5")
    private Integer breakfast5;
    @Column(name = "cellPhone")
    private String cellPhone;
    @Column(name = "checkIn")
    private Boolean checkIn;
    @Column(name = "chineseName")
    private String chineseName;
    @Column(name = "churchCity")
    private String churchCity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "churchID")
    private BigDecimal churchID;
    @Column(name = "churchName")
    private String churchName;
    @Column(name = "churchState")
    private String churchState;
    @Column(name = "coordinator")
    private String coordinator;
    @Column(name = "dinner1")
    private Integer dinner1;
    @Column(name = "dinner2")
    private Integer dinner2;
    @Column(name = "dinner3")
    private Integer dinner3;
    @Column(name = "dinner4")
    private Integer dinner4;
    @Column(name = "dinner5")
    private Integer dinner5;
    @Column(name = "discount")
    private Boolean discount;
    @Column(name = "email")
    private String email;
    @Column(name = "eventID")
    private Integer eventID;
    @Column(name = "faith")
    private Boolean faith;
    @Column(name = "faithYear")
    private Integer faithYear;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "formID")
    private BigDecimal formID;
    @Column(name = "gender")
    private String gender;
    @Column(name = "groupName")
    private String groupName;
    @Column(name = "homeCity")
    private String homeCity;
    @Column(name = "homePhone")
    private String homePhone;
    @Column(name = "homeState")
    private String homeState;
    @Column(name = "homeStreetAddress")
    private String homeStreetAddress;
    @Column(name = "homeZipCode")
    private String homeZipCode;
    @Column(name = "language")
    private String language;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "lodging1")
    private Boolean lodging1;
    @Column(name = "lodging2")
    private Boolean lodging2;
    @Column(name = "lodging3")
    private Boolean lodging3;
    @Column(name = "lodging4")
    private Boolean lodging4;
    @Column(name = "lunch1")
    private Integer lunch1;
    @Column(name = "lunch2")
    private Integer lunch2;
    @Column(name = "lunch3")
    private Integer lunch3;
    @Column(name = "lunch4")
    private Integer lunch4;
    @Column(name = "lunch5")
    private Integer lunch5;
    @Column(name = "misc1")
    private Boolean misc1;
    @Column(name = "misc2")
    private Boolean misc2;
    @Column(name = "mondayPartTime")
    private Boolean mondayPartTime;
    @Column(name = "nameTag")
    private Boolean nameTag;
    @Column(name = "personID")
    private String personID;
    @Column(name = "registrationDate")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    @Column(name = "relationship")
    private String relationship;
    @Column(name = "remarks")
    private String remarks;
    @Column(name = "saturdayPartTime")
    private Boolean saturdayPartTime;
    @Column(name = "seeker")
    private Boolean seeker;
    @Column(name = "seminar")
    private String seminar;
    @Column(name = "seminar1")
    private String seminar1;
    @Column(name = "seminar2")
    private String seminar2;
    @Column(name = "seminar3")
    private String seminar3;
    @Column(name = "status")
    private String status;
    @Column(name = "sundayPartTime")
    private Boolean sundayPartTime;

    public Registration() {
    }

    public Registration(Long registrationID) {
        this.registrationID = registrationID;
    }

    public Long getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(Long registrationID) {
        this.registrationID = registrationID;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getBreakfast1() {
        return breakfast1;
    }

    public void setBreakfast1(Integer breakfast1) {
        this.breakfast1 = breakfast1;
    }

    public Integer getBreakfast2() {
        return breakfast2;
    }

    public void setBreakfast2(Integer breakfast2) {
        this.breakfast2 = breakfast2;
    }

    public Integer getBreakfast3() {
        return breakfast3;
    }

    public void setBreakfast3(Integer breakfast3) {
        this.breakfast3 = breakfast3;
    }

    public Integer getBreakfast4() {
        return breakfast4;
    }

    public void setBreakfast4(Integer breakfast4) {
        this.breakfast4 = breakfast4;
    }

    public Integer getBreakfast5() {
        return breakfast5;
    }

    public void setBreakfast5(Integer breakfast5) {
        this.breakfast5 = breakfast5;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Boolean getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Boolean checkIn) {
        this.checkIn = checkIn;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChurchCity() {
        return churchCity;
    }

    public void setChurchCity(String churchCity) {
        this.churchCity = churchCity;
    }

    public BigDecimal getChurchID() {
        return churchID;
    }

    public void setChurchID(BigDecimal churchID) {
        this.churchID = churchID;
    }

    public String getChurchName() {
        return churchName;
    }

    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }

    public String getChurchState() {
        return churchState;
    }

    public void setChurchState(String churchState) {
        this.churchState = churchState;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public Integer getDinner1() {
        return dinner1;
    }

    public void setDinner1(Integer dinner1) {
        this.dinner1 = dinner1;
    }

    public Integer getDinner2() {
        return dinner2;
    }

    public void setDinner2(Integer dinner2) {
        this.dinner2 = dinner2;
    }

    public Integer getDinner3() {
        return dinner3;
    }

    public void setDinner3(Integer dinner3) {
        this.dinner3 = dinner3;
    }

    public Integer getDinner4() {
        return dinner4;
    }

    public void setDinner4(Integer dinner4) {
        this.dinner4 = dinner4;
    }

    public Integer getDinner5() {
        return dinner5;
    }

    public void setDinner5(Integer dinner5) {
        this.dinner5 = dinner5;
    }

    public Boolean getDiscount() {
        return discount;
    }

    public void setDiscount(Boolean discount) {
        this.discount = discount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public Boolean getFaith() {
        return faith;
    }

    public void setFaith(Boolean faith) {
        this.faith = faith;
    }

    public Integer getFaithYear() {
        return faithYear;
    }

    public void setFaithYear(Integer faithYear) {
        this.faithYear = faithYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BigDecimal getFormID() {
        return formID;
    }

    public void setFormID(BigDecimal formID) {
        this.formID = formID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public String getHomeStreetAddress() {
        return homeStreetAddress;
    }

    public void setHomeStreetAddress(String homeStreetAddress) {
        this.homeStreetAddress = homeStreetAddress;
    }

    public String getHomeZipCode() {
        return homeZipCode;
    }

    public void setHomeZipCode(String homeZipCode) {
        this.homeZipCode = homeZipCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getLodging1() {
        return lodging1;
    }

    public void setLodging1(Boolean lodging1) {
        this.lodging1 = lodging1;
    }

    public Boolean getLodging2() {
        return lodging2;
    }

    public void setLodging2(Boolean lodging2) {
        this.lodging2 = lodging2;
    }

    public Boolean getLodging3() {
        return lodging3;
    }

    public void setLodging3(Boolean lodging3) {
        this.lodging3 = lodging3;
    }

    public Boolean getLodging4() {
        return lodging4;
    }

    public void setLodging4(Boolean lodging4) {
        this.lodging4 = lodging4;
    }

    public Integer getLunch1() {
        return lunch1;
    }

    public void setLunch1(Integer lunch1) {
        this.lunch1 = lunch1;
    }

    public Integer getLunch2() {
        return lunch2;
    }

    public void setLunch2(Integer lunch2) {
        this.lunch2 = lunch2;
    }

    public Integer getLunch3() {
        return lunch3;
    }

    public void setLunch3(Integer lunch3) {
        this.lunch3 = lunch3;
    }

    public Integer getLunch4() {
        return lunch4;
    }

    public void setLunch4(Integer lunch4) {
        this.lunch4 = lunch4;
    }

    public Integer getLunch5() {
        return lunch5;
    }

    public void setLunch5(Integer lunch5) {
        this.lunch5 = lunch5;
    }

    public Boolean getMisc1() {
        return misc1;
    }

    public void setMisc1(Boolean misc1) {
        this.misc1 = misc1;
    }

    public Boolean getMisc2() {
        return misc2;
    }

    public void setMisc2(Boolean misc2) {
        this.misc2 = misc2;
    }

    public Boolean getMondayPartTime() {
        return mondayPartTime;
    }

    public void setMondayPartTime(Boolean mondayPartTime) {
        this.mondayPartTime = mondayPartTime;
    }

    public Boolean getNameTag() {
        return nameTag;
    }

    public void setNameTag(Boolean nameTag) {
        this.nameTag = nameTag;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getSaturdayPartTime() {
        return saturdayPartTime;
    }

    public void setSaturdayPartTime(Boolean saturdayPartTime) {
        this.saturdayPartTime = saturdayPartTime;
    }

    public Boolean getSeeker() {
        return seeker;
    }

    public void setSeeker(Boolean seeker) {
        this.seeker = seeker;
    }

    public String getSeminar() {
        return seminar;
    }

    public void setSeminar(String seminar) {
        this.seminar = seminar;
    }

    public String getSeminar1() {
        return seminar1;
    }

    public void setSeminar1(String seminar1) {
        this.seminar1 = seminar1;
    }

    public String getSeminar2() {
        return seminar2;
    }

    public void setSeminar2(String seminar2) {
        this.seminar2 = seminar2;
    }

    public String getSeminar3() {
        return seminar3;
    }

    public void setSeminar3(String seminar3) {
        this.seminar3 = seminar3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSundayPartTime() {
        return sundayPartTime;
    }

    public void setSundayPartTime(Boolean sundayPartTime) {
        this.sundayPartTime = sundayPartTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registrationID != null ? registrationID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registration)) {
            return false;
        }
        Registration other = (Registration) object;
        if ((this.registrationID == null && other.registrationID != null) || (this.registrationID != null && !this.registrationID.equals(other.registrationID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ws.cccm.application.model.Registration[ registrationID=" + registrationID + " ]";
    }
    
}
