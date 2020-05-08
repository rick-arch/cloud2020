package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7001 {

    private static final Logger logger = LoggerFactory.getLogger(EurekaApplication7001.class);

    public static void main(String[] args) {
        logger.info("-------服务注册中心已启动(Eureka 7001)--------------------");
        SpringApplication.run(EurekaApplication7001.class, args);
    }
}
