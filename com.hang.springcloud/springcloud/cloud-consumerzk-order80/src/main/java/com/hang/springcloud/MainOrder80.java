package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/21
 * @Content:
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class MainOrder80 {
     public static void main(String[] args) {
             SpringApplication.run(MainOrder80.class,args);
         }
}
