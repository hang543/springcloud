package com.hang.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/25
 * @Content:
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentAlibabaMain9001 {
     public static void main(String[] args) {
             SpringApplication.run(PaymentAlibabaMain9001.class,args);
         }
}
