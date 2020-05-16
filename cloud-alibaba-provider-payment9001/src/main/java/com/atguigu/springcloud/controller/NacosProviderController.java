package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    @Value("${server.port}")
    String port;

    @GetMapping("/payment/nacos/{id}")
    public String nacos(@PathVariable("id") Integer id) {
        return "Nacos: serverPort:" + port + "\t,id: " + id;
    }
}
