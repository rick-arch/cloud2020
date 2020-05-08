package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKApplication80 {
    private static final Logger logger = LoggerFactory.getLogger(OrderZKApplication80.class);

    public static void main(String[] args) {
        logger.info("------消费者服务已启动（zookeeper实现）--------------");
        SpringApplication.run(OrderZKApplication80.class, args);
    }
}
