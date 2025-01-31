package com.chase.dq.controller;

import com.chase.dq.entity.PaymentData;
import com.chase.dq.service.DataQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DQ")
public class DataQualityController {
    @Autowired
    DataQualityService dataQualityService;
    @PostMapping("/insert-payment-data")
    public ResponseEntity insertData (@RequestBody PaymentData paymentdata){
        System.out.println(paymentdata);
    dataQualityService.insertPaymentData(paymentdata);
    return new ResponseEntity(HttpStatus.CREATED);
}
}
