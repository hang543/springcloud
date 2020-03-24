package com.hang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/23
 * @Content:
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
     public static void main(String[] args) {
             SpringApplication.run(HystrixDashboardMain9001.class,args);
         }
}
