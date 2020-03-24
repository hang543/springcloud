package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/24
 * @Content:
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
     public static void main(String[] args) {
             SpringApplication.run(ConfigClientMain3355.class,args);
         }
}
