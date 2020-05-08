package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PaymentHystrixService {

    //-------------服务降级------------------------------
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "\tpaymentInfo_OK:id" + id;
    }

    /**
     * 1.服务降级
     * 2.主启动类添加注解@EnableCircuitBreaker
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            //超时设置：3秒以内，正常执行，否则执行fallbackMethod 方法
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_TimeOut(Integer id) {
//        1.异常
//        int a = 10 / 0;
//        2.超时
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池(服务正常)：" + Thread.currentThread().getName() + "\tpaymentInfo_TimeOut:id" + id;
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池（服务失败）：" + Thread.currentThread().getName() + "\tpaymentInfo_TimeOutHandler:id" + id + "(╥╯^╰╥)";
    }

    //-------------服务熔断------------------------------
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"),//失败率达到多少后跳闸

    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("*************id 不能为负数");
        }
        String number = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "调用成功，流水号：" + number;
    }

    public String paymentCircuitBreakerFallback(@PathVariable("id") Integer id){
        return "id不能为负数，请稍后再试！id: "+id;
    }
}
