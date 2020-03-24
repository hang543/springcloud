package com.hang.springcloud.controller;

import com.hang.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id){
        String s = paymentHystrixService.paymentInfo_Ok(id);
        return s;
    }

    @GetMapping("/consumer/payment/hystrix/out/{id}")
//    @HystrixCommand(fallbackMethod ="paymentInfoTimeOutHandle",commandProperties = {
////            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1500")
////    })

    @HystrixCommand
    public String paymentInfoOut(@PathVariable("id") Integer id) {
        String s = paymentHystrixService.paymentInfo_Out(id);
        return s;
    }
    public  String paymentInfoTimeOutHandle(Integer id){
        return "我是消费者80，对方支付系统忙请10秒钟后再试";
    }

    public String paymentGlobalFallbackMethod(){
        return "Global异常处理，请稍后再试 o(╥﹏╥)o";
    }
}
