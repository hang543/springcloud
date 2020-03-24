package com.hang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/21
 * @Content:
 **/
@RestController
@Slf4j
public class OrderZKController {
    public static final String INVOKE_URL = "http://could-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
       String result=restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
       return  result;
    }
}
