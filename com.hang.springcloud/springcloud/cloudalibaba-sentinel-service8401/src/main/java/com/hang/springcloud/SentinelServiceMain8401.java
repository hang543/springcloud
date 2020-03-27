package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/26
 * @Content:
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceMain8401 {
     public static void main(String[] args) {
             SpringApplication.run(SentinelServiceMain8401.class,args);
         }
}
