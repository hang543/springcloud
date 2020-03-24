package com.hang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/23
 * @Content:
 **/
@Component
public class PaymentHystrixFallbackImpl implements  PaymentHystrixService {
    @Override
    public String paymentInfo_Ok(Integer id) {
        return "paymentGlobalFallbackMethod.paymentInfo_Ok";
    }

    @Override
    public String paymentInfo_Out(Integer id) {
        return "paymentGlobalFallbackMethod.paymentInfo_Ok";
    }
}
