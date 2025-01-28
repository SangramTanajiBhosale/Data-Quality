package com.chase.dq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "PaymentData")
public class PaymentData {
    @Id
    private String loadId;
    private String paymentDate;
    private Long paymentId;
    private String paymentTypeName;
    private String paymentAmount;
    private String paymentStatusTypeName;
    private String paymentFrequencyTypeCode;
}
