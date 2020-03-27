package com.hang.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/26
 * @Content:
 **/
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
//
//        int age=10/0;
        log.info("testD 测试RT");
        return "-------testD";
    }

    @GetMapping("/testE")
    public String testE() {
//
        int age = 10 / 0;
        log.info("testE 测试测试异常数");
        return "-------testE";
    }

    @GetMapping("/testHostKey")
    @SentinelResource(value = "testHostKey", blockHandler = "deal_testHostKey")
    public String testHostKey(@RequestParam(value = "p1", required = false) String p1,
                              @RequestParam(value = "p1", required = false) String p2) {
        return "-------testHostKey";
    }

    public String deal_testHostKey(String p1, String p2, BlockException exception) {
        return "-------deal_testHostKey o(╥﹏╥)o";

    }
}