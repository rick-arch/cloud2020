package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 自写轮询算法
 */
public interface LoadBalancer {

    ServiceInstance instance(List<ServiceInstance> instance);


}
