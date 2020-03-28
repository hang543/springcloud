package com.hang.boot.service;

import com.hang.boot.util.IdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/28
 * @Content:
 **/
@Service
public class OrderService {
    @Autowired
    private IdGeneratorSnowflake idGeneratorSnowflake;

    public String getIdBySnowflake(){
        ExecutorService threadPool = new ThreadPoolExecutor(2,
                5,
                2L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());

        for (int i = 0; i <20 ; i++) {
            threadPool.submit(()->{
                System.out.println(idGeneratorSnowflake.snowflakeId());
            });
        }
        threadPool.shutdown();
        return "hello snowflake";
    }
}
