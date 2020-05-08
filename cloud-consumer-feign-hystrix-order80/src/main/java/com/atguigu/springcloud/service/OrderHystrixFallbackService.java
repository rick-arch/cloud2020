package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class OrderHystrixFallbackService implements OrderHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "fallback--------paymentInfo_OK---------";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "fallback-----------paymentInfo_TimeOut------";
    }
}
