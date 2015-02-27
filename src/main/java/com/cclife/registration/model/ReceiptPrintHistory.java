/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cclife.registration.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ephesus
 */
@Entity
@Table(name = "receipt_print_history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReceiptPrintHistory.findAll", query = "SELECT r FROM ReceiptPrintHistory r"),
    @NamedQuery(name = "ReceiptPrintHistory.findByReceiptID", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.receiptID = :receiptID"),
    @NamedQuery(name = "ReceiptPrintHistory.findByContributionSource", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.contributionSource = :contributionSource"),
    @NamedQuery(name = "ReceiptPrintHistory.findByContributorID", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.contributorID = :contributorID"),
    @NamedQuery(name = "ReceiptPrintHistory.findByEventID", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.eventID = :eventID"),
    @NamedQuery(name = "ReceiptPrintHistory.findByReceiptType", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.receiptType = :receiptType"),
    @NamedQuery(name = "ReceiptPrintHistory.findByFirstName", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.firstName = :firstName"),
    @NamedQuery(name = "ReceiptPrintHistory.findByLastName", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.lastName = :lastName"),
    @NamedQuery(name = "ReceiptPrintHistory.findByAddress", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.address = :address"),
    @NamedQuery(name = "ReceiptPrintHistory.findByCity", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.city = :city"),
    @NamedQuery(name = "ReceiptPrintHistory.findByState", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.state = :state"),
    @NamedQuery(name = "ReceiptPrintHistory.findByZip", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.zip = :zip"),
    @NamedQuery(name = "ReceiptPrintHistory.findByDate", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.date = :date"),
    @NamedQuery(name = "ReceiptPrintHistory.findByReceiptAmount", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.receiptAmount = :receiptAmount"),
    @NamedQuery(name = "ReceiptPrintHistory.findByCheckNumber", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.checkNumber = :checkNumber"),
    @NamedQuery(name = "ReceiptPrintHistory.findByCreditCardNumber", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.creditCardNumber = :creditCardNumber"),
    @NamedQuery(name = "ReceiptPrintHistory.findByReceiptPrintDate", query = "SELECT r FROM ReceiptPrintHistory r WHERE r.receiptPrintDate = :receiptPrintDate")})
public class ReceiptPrintHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ReceiptID")
    private String receiptID;
    @Size(max = 50)
    @Column(name = "ContributionSource")
    private String contributionSource;
    @Size(max = 50)
    @Column(name = "ContributorID")
    private String contributorID;
    @Size(max = 50)
    @Column(name = "EventID")
    private String eventID;
    @Size(max = 50)
    @Column(name = "ReceiptType")
    private String receiptType;
    @Size(max = 50)
    @Column(name = "FirstName")
    private String firstName;
    @Size(max = 50)
    @Column(name = "LastName")
    private String lastName;
    @Size(max = 50)
    @Column(name = "Address")
    private String address;
    @Size(max = 50)
    @Column(name = "City")
    private String city;
    @Size(max = 50)
    @Column(name = "State")
    private String state;
    @Size(max = 50)
    @Column(name = "Zip")
    private String zip;
    @Size(max = 50)
    @Column(name = "Date")
    private String date;
    @Size(max = 50)
    @Column(name = "ReceiptAmount")
    private String receiptAmount;
    @Size(max = 50)
    @Column(name = "CheckNumber")
    private String checkNumber;
    @Size(max = 50)
    @Column(name = "CreditCardNumber")
    private String creditCardNumber;
    @Column(name = "ReceiptPrintDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiptPrintDate;

    public ReceiptPrintHistory() {
    }

    public ReceiptPrintHistory(String receiptID) {
        this.receiptID = receiptID;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    public String getContributionSource() {
        return contributionSource;
    }

    public void setContributionSource(String contributionSource) {
        this.contributionSource = contributionSource;
    }

    public String getContributorID() {
        return contributorID;
    }

    public void setContributorID(String contributorID) {
        this.contributorID = contributorID;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Date getReceiptPrintDate() {
        return receiptPrintDate;
    }

    public void setReceiptPrintDate(Date receiptPrintDate) {
        this.receiptPrintDate = receiptPrintDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (receiptID != null ? receiptID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReceiptPrintHistory)) {
            return false;
        }
        ReceiptPrintHistory other = (ReceiptPrintHistory) object;
        if ((this.receiptID == null && other.receiptID != null) || (this.receiptID != null && !this.receiptID.equals(other.receiptID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cclife.registration.model.ReceiptPrintHistory[ receiptID=" + receiptID + " ]";
    }
    
}
