package com.atguigu.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // hystrix 熔断器
public class PaymentHystrixApplication8001 {
    private static final Logger logger = LoggerFactory.getLogger(PaymentHystrixApplication8001.class);

    public static void main(String[] args) {
        logger.info("--------服务熔断已启动（hystrix）--------------");
        SpringApplication.run(PaymentHystrixApplication8001.class, args);
    }

    /**不写如下代码hystrix监控页面会出现：Unable to connect to Command Metric Stream.
     * 此配置是为了服务监控而配置，与服务容错无关。springcloud审计后的坑
     * ServletRegistrationBean 因为springboot的默认路径不是/hystrix.stream
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        HystrixMetricsStreamServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(hystrixMetricsStreamServlet);
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.addUrlMappings("/hystrix.stream");
        servletRegistrationBean.setName("HystrixMetricsStreamServlet");
        return servletRegistrationBean;
    }
}
