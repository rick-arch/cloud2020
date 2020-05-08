package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication3355 {

    private static final Logger logger = LoggerFactory.getLogger(ConfigClientApplication3355.class);

    /**
     * 动态刷新配置(方式一：手动刷新)
     * 1.注解@RefreshScope
     * 2.yml 暴露断点（见bootstrap.yml）
     * 3.发送cmd  post请求（curl -X POST "http://localhost:3355/actuator/refresh"）
     * 方式二：（假如有多个微服务客户端，每个微服务都发送Post？手动刷新？能否广播？一次通知，处处生效？）
     * a.3344 yml 添加
     * management:
     *   endpoints: #暴露bus刷新配置的端点
     *     web:
     *       exposure:
     *         include: 'bus-refresh'
     *  rabbitmq:
     *     host: localhost
     *     port: 5672
     *     username: guest
     *     password: guest
     *  b.3344 3355 3366 pom 添加
     *   <dependency>
     *             <groupId>org.springframework.cloud</groupId>
     *             <artifactId>spring-cloud-starter-bus-amqp</artifactId>
     *         </dependency>
     *  c.修改github内容，并使用cmd curl -X POST "http://localhost:3344/actuator/bus-refresh"
     *  d. 测试3355 3366
     *  http://localhost:3366/configInfo
     *  http://localhost:3355/configInfo
     *
     */
    public static void main(String[] args) {
        logger.info("-------【客户端3355】-配置中心-----------------");
        logger.info("【浏览器地址：http://localhost:3355/configInfo】");
        SpringApplication.run(ConfigClientApplication3355.class, args);
    }
}
