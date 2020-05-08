package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication9527 {
    private static final Logger logger = LoggerFactory.getLogger(GatewayApplication9527.class);

    public static void main(String[] args) {
        logger.info("-------gateway 已启动---------------");
        SpringApplication.run(GatewayApplication9527.class, args);
    }
}
