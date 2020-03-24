package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/23
 * @Content:
 **/
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain {
     public static void main(String[] args) {
             SpringApplication.run(GateWayMain.class,args);
         }
}
