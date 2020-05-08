package com.atguigu.springclou;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamMQProviderApplication8801 {

    private static final Logger logger = LoggerFactory.getLogger(StreamMQProviderApplication8801.class);

    public static void main(String[] args) {
        logger.info("-----Stream Rabbitmq 服务提供者【8801】---已启动----------");
        SpringApplication.run(StreamMQProviderApplication8801.class, args);
    }
}
