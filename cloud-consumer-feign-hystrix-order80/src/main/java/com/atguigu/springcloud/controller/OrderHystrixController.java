package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.OrderHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@DefaultProperties(defaultFallback = "globalMethod")//全局fallback方法
public class OrderHystrixController {

    @Resource
    private OrderHystrixService orderHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        return orderHystrixService.paymentInfo_OK(id);
    }


    /**
     * yml添加 feign.hystrix.enable = true
     * 启动类添加@EnableHystrix注解
     * 1.服务降级
     * 2.主启动类添加注解@EnableCircuitBreakerpaymentInfo_TimeOutHandler
     */
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutOnFallbackMethod", commandProperties = {
//            //超时设置：3秒以内，正常执行，否则执行fallbackMethod 方法
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        int age = 10 / 0;
        return orderHystrixService.paymentInfo_TimeOut(id);
    }

    public String paymentInfo_TimeOutOnFallbackMethod(@PathVariable("id") Integer id) {
        return "消费者（80），系统繁忙，请稍后重试！";
    }

    //下面是全局fallback
    public String globalMethod() {
        return "系统繁忙，请稍后再试！";
    }


}
