package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigCenterApplication3344 {
    private static final Logger logger = LoggerFactory.getLogger(ConfigCenterApplication3344.class);

    public static void main(String[] args) {
        logger.info("-------【服务端3344】配置中心）----------------");
        logger.info("【浏览器访问github文件URL：http://localhost:3344/master/application-dev.yml】");
        SpringApplication.run(ConfigCenterApplication3344.class, args);
    }
}
