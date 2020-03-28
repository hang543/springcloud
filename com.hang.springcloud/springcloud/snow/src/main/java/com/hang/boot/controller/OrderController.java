package com.hang.boot.controller;

import com.hang.boot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/28
 * @Content:
 **/
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @RequestMapping("/snowflake")
    public String snowflake(){
        orderService.getIdBySnowflake();
        return "hello snowflake";
    }
}
