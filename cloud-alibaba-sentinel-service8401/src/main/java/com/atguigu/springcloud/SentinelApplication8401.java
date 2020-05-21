package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication8401 {
    private static final Logger logger = LoggerFactory.getLogger(SentinelApplication8401.class);

    public static void main(String[] args) {
        logger.info("---------Sentinel Service【8401】-----------");
        SpringApplication.run(SentinelApplication8401.class, args);
    }
}
