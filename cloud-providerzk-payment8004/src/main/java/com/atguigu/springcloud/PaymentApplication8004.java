package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向consul或者zookeeper作为注册中心注册服务
public class PaymentApplication8004 {
    private static final Logger logger = LoggerFactory.getLogger(PaymentApplication8004.class);

    public static void main(String[] args) {
        logger.info("------zookeeper服务注册中心已启动--------------");
        SpringApplication.run(PaymentApplication8004.class, args);
    }
}
