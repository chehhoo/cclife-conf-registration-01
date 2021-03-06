/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cclife.registration.controller;

import com.cclife.registration.domain.LabelValue;
import com.cclife.registration.domain.PaymentMethod;
import com.cclife.registration.domain.Paypal;
import com.cclife.registration.model.Mealplan;
import com.cclife.registration.domain.RegistrationForm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;
import com.cclife.registration.model.Person;
import com.cclife.registration.domain.Registrant;
import java.text.ParseException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.cclife.registration.util.DateUtil;

/**
 *
 * @author Ephesus
 */
@Component
public class RegistrationController {

    private static final Logger logger = Logger.getLogger(RegistrationController.class);
    @Autowired
    private Paypal paypalInstance;
    @Autowired
    private String confirmationUrl;
    @Autowired
    private String confirmationAltUrl;
    
    public RegistrationForm initializeForm() {
        RegistrationForm registrationForm = new RegistrationForm();

        List<LabelValue> ageGroup;
        ageGroup = new ArrayList<LabelValue>();

        ageGroup.add(new LabelValue("18-29", "A2"));
        ageGroup.add(new LabelValue("30-39", "A3"));
        ageGroup.add(new LabelValue("40-49", "A4"));
        ageGroup.add(new LabelValue("50-59", "A5"));
        ageGroup.add(new LabelValue("60+", "A6"));
        ageGroup.add(new LabelValue("17", "17"));
        ageGroup.add(new LabelValue("16", "16"));
        ageGroup.add(new LabelValue("15", "15"));
        ageGroup.add(new LabelValue("14", "14"));
        ageGroup.add(new LabelValue("13", "13"));
        ageGroup.add(new LabelValue("12", "12"));
        ageGroup.add(new LabelValue("11", "11"));
        ageGroup.add(new LabelValue("10", "10"));
        ageGroup.add(new LabelValue("9", "9"));
        ageGroup.add(new LabelValue("8", "8"));
        ageGroup.add(new LabelValue("7", "7"));
        ageGroup.add(new LabelValue("6", "6"));
        ageGroup.add(new LabelValue("5", "5"));
        ageGroup.add(new LabelValue("4", "4"));
        ageGroup.add(new LabelValue("3", "3"));
        ageGroup.add(new LabelValue("2", "2"));
        ageGroup.add(new LabelValue("1", "1"));
        ageGroup.add(new LabelValue("0", "0"));

        registrationForm.setAgeGroup(ageGroup);

        List<LabelValue> months;
        months = new ArrayList<LabelValue>();

//        months.add(new LabelValue("January", "01"));
//        months.add(new LabelValue("February", "02"));
//        months.add(new LabelValue("March", "03"));
//        months.add(new LabelValue("April", "04"));
//        months.add(new LabelValue("May", "05"));
//        months.add(new LabelValue("June", "06"));
//        months.add(new LabelValue("July", "07"));
//        months.add(new LabelValue("August", "08"));
//        months.add(new LabelValue("September", "09"));
//        months.add(new LabelValue("October", "10"));
//        months.add(new LabelValue("November", "11"));
//        months.add(new LabelValue("December", "12"));
//
//        registrationForm.setMonths(months);
        List<LabelValue> days;
        days = new ArrayList<LabelValue>();
        days.add(new LabelValue("1", "01"));
        days.add(new LabelValue("2", "02"));
        days.add(new LabelValue("3", "03"));
        days.add(new LabelValue("4", "04"));
        days.add(new LabelValue("5", "05"));
        days.add(new LabelValue("6", "06"));
        days.add(new LabelValue("7", "07"));
        days.add(new LabelValue("8", "08"));
        days.add(new LabelValue("9", "09"));
        days.add(new LabelValue("10", "10"));
        days.add(new LabelValue("11", "11"));
        days.add(new LabelValue("12", "12"));
        days.add(new LabelValue("13", "13"));
        days.add(new LabelValue("14", "14"));
        days.add(new LabelValue("15", "15"));
        days.add(new LabelValue("16", "16"));
        days.add(new LabelValue("17", "17"));
        days.add(new LabelValue("18", "18"));
        days.add(new LabelValue("19", "19"));
        days.add(new LabelValue("20", "20"));
        days.add(new LabelValue("21", "21"));
        days.add(new LabelValue("22", "22"));
        days.add(new LabelValue("23", "23"));
        days.add(new LabelValue("24", "24"));
        days.add(new LabelValue("25", "25"));
        days.add(new LabelValue("26", "26"));
        days.add(new LabelValue("27", "27"));
        days.add(new LabelValue("28", "28"));
        days.add(new LabelValue("29", "29"));
        days.add(new LabelValue("30", "30"));
        days.add(new LabelValue("31", "31"));

//        registrationForm.setDayOfMonth(days);
        List<LabelValue> relationshipGroup;
        relationshipGroup = new ArrayList<LabelValue>();

        relationshipGroup.add(new LabelValue("H(\u592B)", "H")); // H(?)
        relationshipGroup.add(new LabelValue("W(\u59BB)", "W")); // W(?)
        relationshipGroup.add(new LabelValue("S(\u5B50)", "S")); // S(?)
        relationshipGroup.add(new LabelValue("D(\u5973)", "D")); // D(?) 
        relationshipGroup.add(new LabelValue("F(\u7236)", "F")); // F(?)
        relationshipGroup.add(new LabelValue("M(\u6BCD)", "M")); // M(?)
        relationshipGroup.add(new LabelValue("B(\u5144\u5F1F)", "B")); // B(??)
        relationshipGroup.add(new LabelValue("T(\u59CA\u59B9)", "T")); // T(??)
        relationshipGroup.add(new LabelValue("C(\u540C\u5B66)", "C")); // C(??)
        relationshipGroup.add(new LabelValue("O(\u540C\u4E8B)", "O")); // O(??)

        registrationForm.setRelationshipGroup(relationshipGroup);

        List<LabelValue> statusGroup;
        statusGroup = new ArrayList<LabelValue>();

        statusGroup.add(new LabelValue("F(\u5168\u8077\u50B3\u9053)", "F"));
        statusGroup.add(new LabelValue("P(\u6559\u6703\u7267\u8005)", "P"));
        statusGroup.add(new LabelValue("T(\u795E\u5B78\u751F)", "T"));
        statusGroup.add(new LabelValue("N(\u6A5F\u69CB\u540C\u5DE5)", "N"));
        statusGroup.add(new LabelValue("C(\u6821\u5712\u540C\u5DE5)", "C"));
        statusGroup.add(new LabelValue("E(\u6559\u6703\u9577\u57F7)", "E"));
        statusGroup.add(new LabelValue("S(\u5C0F\u7D44\u6216\u5718\u5951\u540C\u5DE5)", "S"));
        statusGroup.add(new LabelValue("O(\u5176\u4ED6)", "O"));
        statusGroup.add(new LabelValue("-- Status(English Conf) --", ""));
        statusGroup.add(new LabelValue("Married", "M"));
        statusGroup.add(new LabelValue("Engaged", "EN"));
        statusGroup.add(new LabelValue("Single", "S"));
        statusGroup.add(new LabelValue("Graduate School", "GS"));
        statusGroup.add(new LabelValue("Undergrad - Sr", "C4"));
        statusGroup.add(new LabelValue("Undergrad - Jr", "C3"));
        statusGroup.add(new LabelValue("Undergrad - So", "C2"));
        statusGroup.add(new LabelValue("Undergrad - Fr", "C1"));
        statusGroup.add(new LabelValue("Senior High - Sr", "12th"));
        statusGroup.add(new LabelValue("Senior High - Jr", "11th"));
        statusGroup.add(new LabelValue("Senior High - So", "10th"));
        statusGroup.add(new LabelValue("Senior High - Fr", "9th"));
        statusGroup.add(new LabelValue("Junior High - 6th grade", "6th"));
        statusGroup.add(new LabelValue("Junior High - 7th grade", "7th"));
        statusGroup.add(new LabelValue("Junior High - 8th grade", "8th"));
        statusGroup.add(new LabelValue("Toddlers (age 0-3)", "TO"));
        statusGroup.add(new LabelValue("Elementary (K-5)", "EL"));
        statusGroup.add(new LabelValue("Other", "O"));
        registrationForm.setStatusGroup(statusGroup);

        List<LabelValue> statusGroup2;
        statusGroup2 = new ArrayList<LabelValue>();

        statusGroup2.add(new LabelValue("Married", "M"));
        statusGroup2.add(new LabelValue("Engaged", "EN"));
        statusGroup2.add(new LabelValue("Single", "S"));
        statusGroup2.add(new LabelValue("Graduate School", "GS"));
        statusGroup2.add(new LabelValue("Undergrad - Sr", "C4"));
        statusGroup2.add(new LabelValue("Undergrad - Jr", "C3"));
        statusGroup2.add(new LabelValue("Undergrad - So", "C2"));
        statusGroup2.add(new LabelValue("Undergrad - Fr", "C1"));
        statusGroup2.add(new LabelValue("Senior High - Sr", "12th"));
        statusGroup2.add(new LabelValue("Senior High - Jr", "11th"));
        statusGroup2.add(new LabelValue("Senior High - So", "10th"));
        statusGroup2.add(new LabelValue("Senior High - Fr", "9th"));
        statusGroup2.add(new LabelValue("Junior High - 6th grade", "6th"));
        statusGroup2.add(new LabelValue("Junior High - 7th grade", "7th"));
        statusGroup2.add(new LabelValue("Junior High - 8th grade", "8th"));
        statusGroup2.add(new LabelValue("Toddlers (age 0-3)", "TO"));
        statusGroup2.add(new LabelValue("Elementary (K-5)", "EL"));
        statusGroup2.add(new LabelValue("Other", "O"));

//        statusGroup2.add(new LabelValue("Married", "M"));
//        statusGroup2.add(new LabelValue("Engaged", "EN"));
//        statusGroup2.add(new LabelValue("Single", "S"));
//        statusGroup2.add(new LabelValue("Graduate School", "G"));
//        statusGroup2.add(new LabelValue("Undergrad   - Sr", "CS"));
//        statusGroup2.add(new LabelValue("Undergrad   - Jr", "CJ"));
//        statusGroup2.add(new LabelValue("Undergrad   - So", "CO"));
//        statusGroup2.add(new LabelValue("Undergrad   - Fr", "CF"));
//        statusGroup2.add(new LabelValue("Senior High - Sr", "SS"));
//        statusGroup2.add(new LabelValue("Senior High - Jr", "SJ"));
//        statusGroup2.add(new LabelValue("Senior High - So", "SO"));
//        statusGroup2.add(new LabelValue("Senior High - Fr", "SF"));
//        statusGroup2.add(new LabelValue("Junior High - 6th grade", "J6"));
//        statusGroup2.add(new LabelValue("Junior High - 7th grade", "J7"));
//        statusGroup2.add(new LabelValue("Junior High - 8th grade", "J8"));
//        statusGroup2.add(new LabelValue("Toddlers (age 0-3)", "TO"));
//        statusGroup2.add(new LabelValue("Elementary (K-5)", "EL"));
//        statusGroup2.add(new LabelValue("Other", "O"));
        registrationForm.setStatusGroup2(statusGroup2);

        List<LabelValue> stateList;
        stateList = new ArrayList<LabelValue>();

        stateList.add(new LabelValue("Illinois", "IL"));
        stateList.add(new LabelValue("Wisconsin", "WI"));
        stateList.add(new LabelValue("Indiana", "IN"));
        stateList.add(new LabelValue("--------------", "ZZ"));
        stateList.add(new LabelValue("Alabama", "AL"));
        stateList.add(new LabelValue("Alaska", "AK"));
        stateList.add(new LabelValue("Alberta", "AB"));
        stateList.add(new LabelValue("American Samoa", "AS"));
        stateList.add(new LabelValue("Arizona", "AZ"));
        stateList.add(new LabelValue("Arkansas", "AR"));
//        stateList.add(new LabelValue("Armed Forces (AE)", "AE"));
//        stateList.add(new LabelValue("Armed Forces Americas", "AA"));
//        stateList.add(new LabelValue("Armed Forces Pacific", "AP"));
        stateList.add(new LabelValue("British Columbia", "BC"));
        stateList.add(new LabelValue("California", "CA"));
        stateList.add(new LabelValue("Colorado", "CO"));
        stateList.add(new LabelValue("Connecticut", "CT"));
        stateList.add(new LabelValue("Delaware", "DE"));
        stateList.add(new LabelValue("District Of Columbia", "DC"));
        stateList.add(new LabelValue("Florida", "FL"));
        stateList.add(new LabelValue("Georgia", "GA"));
        stateList.add(new LabelValue("Guam", "GU"));
        stateList.add(new LabelValue("Hawaii", "HI"));
        stateList.add(new LabelValue("Idaho", "ID"));
        stateList.add(new LabelValue("Illinois", "IL"));
        stateList.add(new LabelValue("Indiana", "IN"));
        stateList.add(new LabelValue("Iowa", "IA"));
        stateList.add(new LabelValue("Kansas", "KS"));
        stateList.add(new LabelValue("Kentucky", "KY"));
        stateList.add(new LabelValue("Louisiana", "LA"));
        stateList.add(new LabelValue("Maine", "ME"));
        stateList.add(new LabelValue("Manitoba", "MB"));
        stateList.add(new LabelValue("Maryland", "MD"));
        stateList.add(new LabelValue("Massachusetts", "MA"));
        stateList.add(new LabelValue("Michigan", "MI"));
        stateList.add(new LabelValue("Minnesota", "MN"));
        stateList.add(new LabelValue("Mississippi", "MS"));
        stateList.add(new LabelValue("Missouri", "MO"));
        stateList.add(new LabelValue("Montana", "MT"));
        stateList.add(new LabelValue("Nebraska", "NE"));
        stateList.add(new LabelValue("Nevada", "NV"));
        stateList.add(new LabelValue("New Brunswick", "NB"));
        stateList.add(new LabelValue("New Hampshire", "NH"));
        stateList.add(new LabelValue("New Jersey", "NJ"));
        stateList.add(new LabelValue("New Mexico", "NM"));
        stateList.add(new LabelValue("New York", "NY"));
//        stateList.add(new LabelValue("Newfoundland", "NF"));
        stateList.add(new LabelValue("North Carolina", "NC"));
        stateList.add(new LabelValue("North Dakota", "ND"));
//        stateList.add(new LabelValue("Northwest Territories", "NT"));
//        stateList.add(new LabelValue("Nova Scotia", "NS"));
//        stateList.add(new LabelValue("Nunavut", "NU"));
        stateList.add(new LabelValue("Ohio", "OH"));
        stateList.add(new LabelValue("Oklahoma", "OK"));
        stateList.add(new LabelValue("Ontario", "ON"));
        stateList.add(new LabelValue("Oregon", "OR"));
        stateList.add(new LabelValue("Pennsylvania", "PA"));
//        stateList.add(new LabelValue("Prince Edward Island", "PE"));
//        stateList.add(new LabelValue("Puerto Rico", "PR"));
//        stateList.add(new LabelValue("Quebec", "PQ"));
        stateList.add(new LabelValue("Rhode Island", "RI"));
//        stateList.add(new LabelValue("Saskatchewan", "SK"));
        stateList.add(new LabelValue("South Carolina", "SC"));
        stateList.add(new LabelValue("South Dakota", "SD"));
        stateList.add(new LabelValue("Tennessee", "TN"));
        stateList.add(new LabelValue("Texas", "TX"));
        stateList.add(new LabelValue("Utah", "UT"));
        stateList.add(new LabelValue("Vermont", "VT"));
        stateList.add(new LabelValue("Virgin Islands", "VI"));
        stateList.add(new LabelValue("Virginia", "VA"));
        stateList.add(new LabelValue("Washington", "WA"));
        stateList.add(new LabelValue("West Virginia", "WV"));
        stateList.add(new LabelValue("Wisconsin", "WI"));
        stateList.add(new LabelValue("Wyoming", "WY"));
//        stateList.add(new LabelValue("Yukon Territory", "YT"));

        registrationForm.setStateList(stateList);

        List<LabelValue> countryList;
        countryList = new ArrayList<LabelValue>();

        countryList.add(new LabelValue("United States America", "US"));
        countryList.add(new LabelValue("Canada", "CA"));

        registrationForm.setCountries(countryList);

        try {
            Date d = DateUtil.getToday().getTime();
            //        registrationForm.setQuantity(1);
            registrationForm.setRegistrationDate(d);

        } catch (ParseException ex) {
            logger.error("Error generating Registration ID");
        }
        registrationForm.setPaymentMethod(PaymentMethod.WAIVED);
        logger.info("initialize Form exiting");
        return registrationForm;
    }

    public Registrant createNewPerson(RegistrationForm form) {

        if (form.getRegistrants() == null) {
            ArrayList<Registrant> rlist = new ArrayList<Registrant>();
            form.setRegistrants(rlist);
        }

        Registrant registrant = new Registrant();
        Person person = new Person();
        person.setFirstName("New");
        registrant.setPerson(person);
        form.getRegistrants().add(registrant);
        Mealplan mealPlan = new Mealplan();
        registrant.setMealplan(mealPlan);

        return registrant;
    }

    public Paypal createPaypalRequest(RegistrationForm form) {

        logger.info("createPaypalRequest entering");

        paypalInstance.setItem_number(String.valueOf(form.getFormID().longValue()));

//        p.setCmd("_ext-enter");
//        p.setRedirect_cmd("_xclick");
//        p.setBusiness("Registration@cccm.ws");
//        p.setBusiness("clhoo_1288811245_biz@msn.com");
//        p.setItem_name("CCCC/Grace 2014");
        double total = form.getExpense().getTotalAdultRegistrationFee() + form.getExpense().getTotalNonAdultRegistrationFee() + form.getExpense().getTotalMealsFee();
        paypalInstance.setAmount(String.valueOf(total));
        paypalInstance.setCustom(String.valueOf(total));
//        p.setNo_shipping("0");
//        p.setNo_note("1");
//        p.setCurrency_code("USD");
//        p.setLc("US");
//        p.setBn("PP-BuyNowBF");
//        p.setReturn("http://localhost:9090/Registration/confirm.htm");
//        p.setReturn("http://cccm.biz:8084/registration/confirm.htm");
//        p.setNotify_url("http://cccm.biz:8084/registration/instantPaymentNotification.htm");
//        p.setRm("2");
        paypalInstance.setEmail(form.getAddress().getMisc1());
        paypalInstance.setFirst_name("");
        paypalInstance.setLast_name("");
        paypalInstance.setAddress1(form.getAddress().getHomeAddress());
        paypalInstance.setAddress2(form.getAddress().getHomeAddress2());
        paypalInstance.setCity(form.getAddress().getHomeCity());
        paypalInstance.setState(form.getAddress().getHomeState());
        paypalInstance.setZip(form.getAddress().getHomeZip());
        paypalInstance.setReturn(confirmationUrl);

        if (form.getEventID().compareTo(201403) == 0) {
            paypalInstance.setReturn(confirmationAltUrl);
        }
        logger.info("createPaypalRequest exiting");

        return paypalInstance;
    }
}
