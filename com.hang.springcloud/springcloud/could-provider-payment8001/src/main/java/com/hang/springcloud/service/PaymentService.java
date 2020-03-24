package com.hang.springcloud.service;

import com.hang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/19
 * @Content:
 **/
public interface PaymentService {
    public int  create(Payment payment);
    public  Payment getPaymentById(@Param("id")Long id);
}
