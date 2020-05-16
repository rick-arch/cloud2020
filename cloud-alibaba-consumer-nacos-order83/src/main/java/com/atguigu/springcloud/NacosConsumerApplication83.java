package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerApplication83 {
    private static final Logger logger = LoggerFactory.getLogger(NacosConsumerApplication83.class);

    public static void main(String[] args) {
        logger.info("----Nacos 服务消费者 83-----------------");
        SpringApplication.run(NacosConsumerApplication83.class);
    }
}
