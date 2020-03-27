package com.hang.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hang.springcloud.entities.CommonResult;
import com.hang.springcloud.entities.Payment;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/26
 * @Content:
 **/
public class CustomerHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"按客户自定义的global handlerException--1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"按客户自定义的global handlerException--2");
    }
}
