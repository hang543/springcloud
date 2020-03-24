package com.hang.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import cn.hutool.core.util.IdUtil;
import java.util.concurrent.TimeUnit;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/22
 * @Content:
 **/
@Service
public class PaymentService {
    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    public String paymentInfo_Ok(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_OK,id: " + "\t" + "哈哈";
    }

    /**
     * 模拟线程失效
     * @param id
     * @return
     * HystrixCommand如果方法响应失败调用兜底方法
     */
    @HystrixCommand(fallbackMethod ="paymentInfo_TimeOutHandle",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="5000")
    })
    public String paymentInfo_Out(Integer id) {
        int timeNumber=3;
//        int a=10/0;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_Out,id: " + "\t" + "失败"+"耗时"+timeNumber+"秒钟";
    }

    public  String paymentInfo_TimeOutHandle(Integer id){
        return "线程池：" + Thread.currentThread().getName() + " 系统繁忙，请稍后再试: " + "\t" +id+"o(╥﹏╥)o";


    }

    /**************************************************************************************************************
     * 服务熔断
     */

    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),// 是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),// 请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),// 失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        if(id < 0)
        {
            throw new RuntimeException("******id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();

        return Thread.currentThread().getName()+"\t"+"调用成功，流水号: " + serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id)
    {
        return "id 不能负数，请稍后再试，/(ㄒoㄒ)/~~   id: " +id;
    }

}
