package com.hang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/24
 * @Content:
 **/
@RestController
@RefreshScope
public class ConfigClientConroller {
     @Value("${server.port}")
    private  String serverPort;

    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return  configInfo;
    }
}
