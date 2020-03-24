package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/21
 * @Content:EnableDiscoveryClient//该注解用于使用consul或者zookeeper作为注册服务
 *
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004  {
     public static void main(String[] args) {
             SpringApplication.run(PaymentMain8004.class,args);
         }
}
