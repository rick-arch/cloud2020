package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulApplication80 {
    private static final Logger logger = LoggerFactory.getLogger(OrderConsulApplication80.class);

    public static void main(String[] args) {
        logger.info("--------服务消费者已启动（consul）-------------------");
        SpringApplication.run(OrderConsulApplication80.class, args);
    }
}
