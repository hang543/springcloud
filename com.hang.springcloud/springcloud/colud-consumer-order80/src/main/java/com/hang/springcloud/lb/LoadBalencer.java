package com.hang.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/22
 * @Content:
 **/
public interface LoadBalencer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
