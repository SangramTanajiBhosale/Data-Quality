package com.chase.dq.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "PaymentData")
public class PaymentData {
    @Id
    private String loanId;
    private String paymentDate;
    private String paymentId;
    private String paymentTypeName;
    private String paymentAmount;
    private String paymentStatusTypeName;
    private String paymentFrequencyTypeCode;

    // Getter and Setter for loanId
    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    // Getter and Setter for paymentDate
    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    // Getter and Setter for paymentId
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    // Getter and Setter for paymentTypeName
    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    // Getter and Setter for paymentAmount
    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    // Getter and Setter for paymentStatusTypeName
    public String getPaymentStatusTypeName() {
        return paymentStatusTypeName;
    }

    public void setPaymentStatusTypeName(String paymentStatusTypeName) {
        this.paymentStatusTypeName = paymentStatusTypeName;
    }

    // Getter and Setter for paymentFrequencyTypeCode
    public String getPaymentFrequencyTypeCode() {
        return paymentFrequencyTypeCode;
    }

    public void setPaymentFrequencyTypeCode(String paymentFrequencyTypeCode) {
        this.paymentFrequencyTypeCode = paymentFrequencyTypeCode;
    }
}
