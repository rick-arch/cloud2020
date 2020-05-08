package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置不能放在@ComponentScan当前包下以及子包下
 * 负载均衡默认为轮询，
 */
@Configuration
public class RibbonConfig {

    @Bean
    public IRule iRule() {
        return new RandomRule();//现定义为随机
    }
}
