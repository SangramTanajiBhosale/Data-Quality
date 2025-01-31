package com.chase.dq.service;

import com.chase.dq.entity.PaymentData;
import com.chase.dq.repository.DataQualityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataQualityService {
    @Autowired
    DataQualityRepository dataQualityRepository;
    public void insertPaymentData(PaymentData paymentData){
        int randomNumber = (int) (Math.random() * 90000) + 10000;
        paymentData.setLoanId("LOAN"+randomNumber);
        paymentData.setPaymentStatusTypeName("Completed"); // implement later
        paymentData.setPaymentId(UUID.randomUUID().toString());
        dataQualityRepository.save(paymentData);
    }
}
