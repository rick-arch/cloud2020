package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3366 {

    private static final Logger logger = LoggerFactory.getLogger(ConfigClientApplication3366.class);

    public static void main(String[] args) {
        logger.info("-------【客户端3366】-配置中心-----------------");
        SpringApplication.run(ConfigClientApplication3366.class, args);
    }
}
