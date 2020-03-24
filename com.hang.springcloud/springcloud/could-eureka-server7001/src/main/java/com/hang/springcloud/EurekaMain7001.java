package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/20
 * @Content:
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
     public static void main(String[] args) {
             SpringApplication.run(EurekaMain7001.class,args);
         }
}
