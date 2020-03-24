package com.hang.feign.controller;

import com.hang.feign.service.PaymentFeignService;
import com.hang.springcloud.entities.CommonResult;
import com.hang.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/22
 * @Content:
 **/
@Slf4j
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
      return paymentFeignService.getPaymentById(id);
    }
}
