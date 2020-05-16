package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication9001 {

    private static final Logger logger = LoggerFactory.getLogger(NacosProviderApplication9001.class);

    public static void main(String[] args) {
        logger.info("-------Nacos 服务提供者 9001-----------------");
        SpringApplication.run(NacosProviderApplication9001.class);
    }
}
