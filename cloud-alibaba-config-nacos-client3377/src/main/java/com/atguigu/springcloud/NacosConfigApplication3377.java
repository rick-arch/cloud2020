package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigApplication3377 {
    private static final Logger logger = LoggerFactory.getLogger(NacosConfigApplication3377.class);

    public static void main(String[] args) {
        logger.info("----【Nacos服务配置中心】【3377】------------");
        SpringApplication.run(NacosConfigApplication3377.class);
    }
}
