/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.cccm.registration.utils;

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author CH1CHOO1
 */
public class RegistrationAssessment implements Serializable {

    private static long serialVersionUID = -558954560L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    private Long registrationID = 0L;
    private Date registrationDate = null;
    private Long churchID = 0L;
    private String churchName = "";
    private Integer totalBreakfast1 = 0;
    private Integer totalBreakfast2 = 0;
    private Integer totalBreakfast3 = 0;
    private Integer totalBreakfast4 = 0;
    private Integer totalLunch1 = 0;
    private Integer totalLunch2 = 0;
    private Integer totalLunch3 = 0;
    private Integer totalLunch4 = 0;
    private Integer totalDinner1 = 0;
    private Integer totalDinner2 = 0;
    private Integer totalDinner3 = 0;
    private Integer totalDinner4 = 0;
    private String homeStreetAddress = "";
    private String homeCity = "";
    private String homeState = "";
    private String homeZipCode = "";
    private String homePhone = "";
    private String email = "";
    private Integer breakfastTotal = 0;
    private Integer lunchTotal = 0;
    private Integer dinnerTotal = 0;
    private Integer totalAdult = 0;
    private Integer totalBaby = 0;
    private Integer totalNonAdult = 0;
    private Integer totalAdultRegistrationFee = 0;
    private Integer totalNonAdultRegistrationFee = 0;
    private Integer totalRegistrationFee = 0;
    private Integer totalBreakfastFee = 0;
    private Integer totalLunchFee = 0;
    private Integer totalDinnerFee = 0;
    private Integer totalMealsFee = 0;
    private Integer grandTotal = 0;
    private String paymentStatus = "";
    private String seminars = "";

    public RegistrationAssessment() {
    }

    /**
     * @return the registrationID
     */
    public Long getRegistrationID() {
        return registrationID;
    }

    /**
     * @param registrationID the registrationID to set
     */
    public void setRegistrationID(Long registrationID) {
        this.registrationID = registrationID;
    }

    /**
     * @return the registrationDate
     */
    public Date getRegistrationDate() {
        return registrationDate;
    }

    /**
     * @param registrationDate the registrationDate to set
     */
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * @return the churchID
     */
    public Long getChurchID() {
        return churchID;
    }

    /**
     * @param churchID the churchID to set
     */
    public void setChurchID(Long churchID) {
        this.churchID = churchID;
    }

    /**
     * @return the churchName
     */
    public String getChurchName() {
        return churchName;
    }

    /**
     * @param churchName the churchName to set
     */
    public void setChurchName(String churchName) {
        this.churchName = churchName;
    }

    /**
     * @return the totalBreakfast1
     */
    public Integer getTotalBreakfast1() {
        return totalBreakfast1;
    }

    /**
     * @param totalBreakfast1 the totalBreakfast1 to set
     */
    public void setTotalBreakfast1(Integer totalBreakfast1) {
        this.totalBreakfast1 = totalBreakfast1;
    }

    /**
     * @return the totalBreakfast2
     */
    public Integer getTotalBreakfast2() {
        return totalBreakfast2;
    }

    /**
     * @param totalBreakfast2 the totalBreakfast2 to set
     */
    public void setTotalBreakfast2(Integer totalBreakfast2) {
        this.totalBreakfast2 = totalBreakfast2;
    }

    /**
     * @return the totalBreakfast3
     */
    public Integer getTotalBreakfast3() {
        return totalBreakfast3;
    }

    /**
     * @param totalBreakfast3 the totalBreakfast3 to set
     */
    public void setTotalBreakfast3(Integer totalBreakfast3) {
        this.totalBreakfast3 = totalBreakfast3;
    }

    /**
     * @return the totalBreakfast4
     */
    public Integer getTotalBreakfast4() {
        return totalBreakfast4;
    }

    /**
     * @param totalBreakfast4 the totalBreakfast4 to set
     */
    public void setTotalBreakfast4(Integer totalBreakfast4) {
        this.totalBreakfast4 = totalBreakfast4;
    }

    /**
     * @return the totalLunch1
     */
    public Integer getTotalLunch1() {
        return totalLunch1;
    }

    /**
     * @param totalLunch1 the totalLunch1 to set
     */
    public void setTotalLunch1(Integer totalLunch1) {
        this.totalLunch1 = totalLunch1;
    }

    /**
     * @return the totalLunch2
     */
    public Integer getTotalLunch2() {
        return totalLunch2;
    }

    /**
     * @param totalLunch2 the totalLunch2 to set
     */
    public void setTotalLunch2(Integer totalLunch2) {
        this.totalLunch2 = totalLunch2;
    }

    /**
     * @return the totalLunch3
     */
    public Integer getTotalLunch3() {
        return totalLunch3;
    }

    /**
     * @param totalLunch3 the totalLunch3 to set
     */
    public void setTotalLunch3(Integer totalLunch3) {
        this.totalLunch3 = totalLunch3;
    }

    /**
     * @return the totalLunch4
     */
    public Integer getTotalLunch4() {
        return totalLunch4;
    }

    /**
     * @param totalLunch4 the totalLunch4 to set
     */
    public void setTotalLunch4(Integer totalLunch4) {
        this.totalLunch4 = totalLunch4;
    }

    /**
     * @return the totalDinner1
     */
    public Integer getTotalDinner1() {
        return totalDinner1;
    }

    /**
     * @param totalDinner1 the totalDinner1 to set
     */
    public void setTotalDinner1(Integer totalDinner1) {
        this.totalDinner1 = totalDinner1;
    }

    /**
     * @return the totalDinner2
     */
    public Integer getTotalDinner2() {
        return totalDinner2;
    }

    /**
     * @param totalDinner2 the totalDinner2 to set
     */
    public void setTotalDinner2(Integer totalDinner2) {
        this.totalDinner2 = totalDinner2;
    }

    /**
     * @return the totalDinner3
     */
    public Integer getTotalDinner3() {
        return totalDinner3;
    }

    /**
     * @param totalDinner3 the totalDinner3 to set
     */
    public void setTotalDinner3(Integer totalDinner3) {
        this.totalDinner3 = totalDinner3;
    }

    /**
     * @return the totalDinner4
     */
    public Integer getTotalDinner4() {
        return totalDinner4;
    }

    /**
     * @param totalDinner4 the totalDinner4 to set
     */
    public void setTotalDinner4(Integer totalDinner4) {
        this.totalDinner4 = totalDinner4;
    }

    /**
     * @return the homeStreetAddress
     */
    public String getHomeStreetAddress() {
        return homeStreetAddress;
    }

    /**
     * @param homeStreetAddress the homeStreetAddress to set
     */
    public void setHomeStreetAddress(String homeStreetAddress) {
        this.homeStreetAddress = homeStreetAddress;
    }

    /**
     * @return the homeCity
     */
    public String getHomeCity() {
        return homeCity;
    }

    /**
     * @param homeCity the homeCity to set
     */
    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    /**
     * @return the homeState
     */
    public String getHomeState() {
        return homeState;
    }

    /**
     * @param homeState the homeState to set
     */
    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    /**
     * @return the homeZipCode
     */
    public String getHomeZipCode() {
        return homeZipCode;
    }

    /**
     * @param homeZipCode the homeZipCode to set
     */
    public void setHomeZipCode(String homeZipCode) {
        this.homeZipCode = homeZipCode;
    }

    /**
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the breakfastTotal
     */
    public Integer getBreakfastTotal() {
        return breakfastTotal;
    }

    /**
     * @param breakfastTotal the breakfastTotal to set
     */
    public void setBreakfastTotal(Integer breakfastTotal) {
        this.breakfastTotal = breakfastTotal;
    }

    /**
     * @return the lunchTotal
     */
    public Integer getLunchTotal() {
        return lunchTotal;
    }

    /**
     * @param lunchTotal the lunchTotal to set
     */
    public void setLunchTotal(Integer lunchTotal) {
        this.lunchTotal = lunchTotal;
    }

    /**
     * @return the dinnerTotal
     */
    public Integer getDinnerTotal() {
        return dinnerTotal;
    }

    /**
     * @param dinnerTotal the dinnerTotal to set
     */
    public void setDinnerTotal(Integer dinnerTotal) {
        this.dinnerTotal = dinnerTotal;
    }

    /**
     * @return the totalAdult
     */
    public Integer getTotalAdult() {
        return totalAdult;
    }

    /**
     * @param totalAdult the totalAdult to set
     */
    public void setTotalAdult(Integer totalAdult) {
        this.totalAdult = totalAdult;
    }

    /**
     * @return the totalBaby
     */
    public Integer getTotalBaby() {
        return totalBaby;
    }

    /**
     * @param totalBaby the totalBaby to set
     */
    public void setTotalBaby(Integer totalBaby) {
        this.totalBaby = totalBaby;
    }

    /**
     * @return the totalNonAdult
     */
    public Integer getTotalNonAdult() {
        return totalNonAdult;
    }

    /**
     * @param totalNonAdult the totalNonAdult to set
     */
    public void setTotalNonAdult(Integer totalNonAdult) {
        this.totalNonAdult = totalNonAdult;
    }

    /**
     * @return the totalAdultRegistrationFee
     */
    public Integer getTotalAdultRegistrationFee() {
        return totalAdultRegistrationFee;
    }

    /**
     * @param totalAdultRegistrationFee the totalAdultRegistrationFee to set
     */
    public void setTotalAdultRegistrationFee(Integer totalAdultRegistrationFee) {
        this.totalAdultRegistrationFee = totalAdultRegistrationFee;
    }

    /**
     * @return the totalNonAdultRegistrationFee
     */
    public Integer getTotalNonAdultRegistrationFee() {
        return totalNonAdultRegistrationFee;
    }

    /**
     * @param totalNonAdultRegistrationFee the totalNonAdultRegistrationFee to set
     */
    public void setTotalNonAdultRegistrationFee(Integer totalNonAdultRegistrationFee) {
        this.totalNonAdultRegistrationFee = totalNonAdultRegistrationFee;
    }

    /**
     * @return the totalRegistrationFee
     */
    public Integer getTotalRegistrationFee() {
        return totalRegistrationFee;
    }

    /**
     * @param totalRegistrationFee the totalRegistrationFee to set
     */
    public void setTotalRegistrationFee(Integer totalRegistrationFee) {
        this.totalRegistrationFee = totalRegistrationFee;
    }

    /**
     * @return the totalBreakfastFee
     */
    public Integer getTotalBreakfastFee() {
        return totalBreakfastFee;
    }

    /**
     * @param totalBreakfastFee the totalBreakfastFee to set
     */
    public void setTotalBreakfastFee(Integer totalBreakfastFee) {
        this.totalBreakfastFee = totalBreakfastFee;
    }

    /**
     * @return the totalLunchFee
     */
    public Integer getTotalLunchFee() {
        return totalLunchFee;
    }

    /**
     * @param totalLunchFee the totalLunchFee to set
     */
    public void setTotalLunchFee(Integer totalLunchFee) {
        this.totalLunchFee = totalLunchFee;
    }

    /**
     * @return the totalDinnerFee
     */
    public Integer getTotalDinnerFee() {
        return totalDinnerFee;
    }

    /**
     * @param totalDinnerFee the totalDinnerFee to set
     */
    public void setTotalDinnerFee(Integer totalDinnerFee) {
        this.totalDinnerFee = totalDinnerFee;
    }

    /**
     * @return the totalMealsFee
     */
    public Integer getTotalMealsFee() {
        return totalMealsFee;
    }

    /**
     * @param totalMealsFee the totalMealsFee to set
     */
    public void setTotalMealsFee(Integer totalMealsFee) {
        this.totalMealsFee = totalMealsFee;
    }

    /**
     * @return the grandTotal
     */
    public Integer getGrandTotal() {
        return grandTotal;
    }

    /**
     * @param grandTotal the grandTotal to set
     */
    public void setGrandTotal(Integer grandTotal) {
        this.grandTotal = grandTotal;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the paymentStatus
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * @param paymentStatus the paymentStatus to set
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * @param seminars the seminars to set
     */
    public void setSeminars(String seminars) {
        this.seminars = seminars;
    }
}
