package com.atguigu.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //启用hystrix 监控 访问地址：http://localhost:9001/hystrix
public class HystrixDashboardApplication9001 {
    private static final Logger logger = LoggerFactory.getLogger(HystrixDashboardApplication9001.class);

    public static void main(String[] args) {
        logger.info("-------hystrix 图形监控---------------");
        SpringApplication.run(HystrixDashboardApplication9001.class, args);
    }
}
