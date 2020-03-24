package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/24
 * @Content:
 **/
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
     public static void main(String[] args) {
             SpringApplication.run(ConfigCenterMain3344.class,args);
         }
}
