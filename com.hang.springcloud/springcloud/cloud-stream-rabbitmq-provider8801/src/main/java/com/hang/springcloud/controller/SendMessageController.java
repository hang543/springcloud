package com.hang.springcloud.controller;

import com.hang.springcloud.service.Impl.MessageProviderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/24
 * @Content:
 **/
@RestController
public class SendMessageController {
    @Resource
    private MessageProviderImpl messageProvider;
    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
