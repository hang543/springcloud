package com.hang.springcloud.controller;

import com.hang.springcloud.entities.CommonResult;
import com.hang.springcloud.entities.Payment;
import com.hang.springcloud.service.PaymentService;
import com.hang.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/19
 * @Content:
 **/
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private  String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,serverPort"+serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果：" + payment+"\t"+"嘿嘿");
        if (payment !=null) {
            return new CommonResult(200, "查询成功 serverPort"+serverPort, payment);
        } else {
            return new CommonResult(444, "查询失败，没有对象ID"+id, null);
        }
    }
    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return  serverPort;
    }
}
