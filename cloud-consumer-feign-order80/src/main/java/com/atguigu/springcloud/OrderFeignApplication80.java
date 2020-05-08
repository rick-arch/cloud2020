package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //使用feign
public class OrderFeignApplication80 {
    private static final Logger logger = LoggerFactory.getLogger(OrderFeignApplication80.class);

    public static void main(String[] args) {
        logger.info("----服务消费者已启动（feign）-------------");
        SpringApplication.run(OrderFeignApplication80.class, args);
    }
}
