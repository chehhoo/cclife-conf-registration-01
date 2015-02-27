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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ephesus
 */
@Entity
@Table(name = "contribution")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contribution.findAll", query = "SELECT c FROM Contribution c"),
    @NamedQuery(name = "Contribution.findByContributionID", query = "SELECT c FROM Contribution c WHERE c.contributionID = :contributionID"),
    @NamedQuery(name = "Contribution.findByCommitContributionID", query = "SELECT c FROM Contribution c WHERE c.commitContributionID = :commitContributionID"),
    @NamedQuery(name = "Contribution.findByReceiptID", query = "SELECT c FROM Contribution c WHERE c.receiptID = :receiptID"),
    @NamedQuery(name = "Contribution.findByTargetSource", query = "SELECT c FROM Contribution c WHERE c.targetSource = :targetSource"),
    @NamedQuery(name = "Contribution.findByTargetID", query = "SELECT c FROM Contribution c WHERE c.targetID = :targetID"),
    @NamedQuery(name = "Contribution.findByContributionSource", query = "SELECT c FROM Contribution c WHERE c.contributionSource = :contributionSource"),
    @NamedQuery(name = "Contribution.findByContributorID", query = "SELECT c FROM Contribution c WHERE c.contributorID = :contributorID"),
    @NamedQuery(name = "Contribution.findByContributionAmount", query = "SELECT c FROM Contribution c WHERE c.contributionAmount = :contributionAmount"),
    @NamedQuery(name = "Contribution.findByTransactionType", query = "SELECT c FROM Contribution c WHERE c.transactionType = :transactionType"),
    @NamedQuery(name = "Contribution.findByReferenceNumber", query = "SELECT c FROM Contribution c WHERE c.referenceNumber = :referenceNumber"),
    @NamedQuery(name = "Contribution.findByCategory", query = "SELECT c FROM Contribution c WHERE c.category = :category"),
    @NamedQuery(name = "Contribution.findByReceivedDate", query = "SELECT c FROM Contribution c WHERE c.receivedDate = :receivedDate")})
public class Contribution implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ContributionID")
    private Integer contributionID;
    @Column(name = "CommitContributionID")
    private Integer commitContributionID;
    @Size(max = 50)
    @Column(name = "ReceiptID")
    private String receiptID;
    @Size(max = 50)
    @Column(name = "TargetSource")
    private String targetSource;
    @Column(name = "TargetID")
    private Integer targetID;
    @Size(max = 50)
    @Column(name = "ContributionSource")
    private String contributionSource;
    @Column(name = "ContributorID")
    private Integer contributorID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ContributionAmount")
    private Double contributionAmount;
    @Size(max = 50)
    @Column(name = "TransactionType")
    private String transactionType;
    @Size(max = 50)
    @Column(name = "ReferenceNumber")
    private String referenceNumber;
    @Size(max = 50)
    @Column(name = "Category")
    private String category;
    @Column(name = "ReceivedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedDate;

    public Contribution() {
    }

    public Contribution(Integer contributionID) {
        this.contributionID = contributionID;
    }

    public Integer getContributionID() {
        return contributionID;
    }

    public void setContributionID(Integer contributionID) {
        this.contributionID = contributionID;
    }

    public Integer getCommitContributionID() {
        return commitContributionID;
    }

    public void setCommitContributionID(Integer commitContributionID) {
        this.commitContributionID = commitContributionID;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    public String getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(String targetSource) {
        this.targetSource = targetSource;
    }

    public Integer getTargetID() {
        return targetID;
    }

    public void setTargetID(Integer targetID) {
        this.targetID = targetID;
    }

    public String getContributionSource() {
        return contributionSource;
    }

    public void setContributionSource(String contributionSource) {
        this.contributionSource = contributionSource;
    }

    public Integer getContributorID() {
        return contributorID;
    }

    public void setContributorID(Integer contributorID) {
        this.contributorID = contributorID;
    }

    public Double getContributionAmount() {
        return contributionAmount;
    }

    public void setContributionAmount(Double contributionAmount) {
        this.contributionAmount = contributionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contributionID != null ? contributionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contribution)) {
            return false;
        }
        Contribution other = (Contribution) object;
        if ((this.contributionID == null && other.contributionID != null) || (this.contributionID != null && !this.contributionID.equals(other.contributionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cclife.registration.model.Contribution[ contributionID=" + contributionID + " ]";
    }
    
}
