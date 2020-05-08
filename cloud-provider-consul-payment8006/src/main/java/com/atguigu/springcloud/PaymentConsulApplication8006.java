package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulApplication8006 {
    private static final Logger logger = LoggerFactory.getLogger(PaymentConsulApplication8006.class);

    public static void main(String[] args) {
        logger.info("-------服务注册中心已启动（consul实现）-------------");
        SpringApplication.run(PaymentConsulApplication8006.class, args);
    }
}
