package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/22
 * @Content:
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrder80 {
     public static void main(String[] args) {
             SpringApplication.run(HystrixOrder80.class,args);
         }
}
