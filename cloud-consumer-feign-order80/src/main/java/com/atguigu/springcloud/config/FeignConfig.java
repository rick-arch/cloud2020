package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign 日志打印配置
 */
@Configuration
public class FeignConfig {

    /**feign 日志级别
     * NONE： 默认，不显示任何日志
     * BASIC：仅记录请求方法、URL、响应状态码以及执行时间
     * HEADERS：除了BASIC中定义的信息外，还有请求和响应的头信息
     * FULL：除了HEADERS中定义的信息外，还有请求和响应的正文以及元数据
     */
    @Bean
    Logger.Level loggerLevel(){
        return Logger.Level.FULL;
    }
}
