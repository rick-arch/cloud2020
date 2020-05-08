package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamMQConsumerApplication8802 {

    private static final Logger logger = LoggerFactory.getLogger(StreamMQConsumerApplication8802.class);

    public static void main(String[] args) {
        logger.info("-----Stream Rabbitmq 服務消費者【8802】----已启动---------");
        SpringApplication.run(StreamMQConsumerApplication8802.class,args);
    }
}
