package com.chase.dq.repository;

import com.chase.dq.entity.PaymentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataQualityRepository extends JpaRepository<PaymentData,String> {
}
