package com.hang.springcloud.controller;

import com.hang.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
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
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id) {
        String info_ok = paymentService.paymentInfo_Ok(id);
        log.info("***********" + info_ok);
        return info_ok;
    }

    @GetMapping("/payment/hystrix/out/{id}")
    public String paymentInfo_Out(@PathVariable("id") Integer id) {
        String info_out = paymentService.paymentInfo_Out(id);
        log.info("***********" + info_out);
        return info_out;
    }

    /********
     * 服务熔断
     */
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable Integer id) {
        String circuitBreaker = paymentService.paymentCircuitBreaker(id);
        log.info("***result :" + circuitBreaker);
        return circuitBreaker;
    }
}
