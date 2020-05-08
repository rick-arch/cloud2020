package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentConsulController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/payment/consul")
    public String consul() {
        return "Spring Cloud with consul:" + port + "\t" + UUID.randomUUID().toString();
    }
}
