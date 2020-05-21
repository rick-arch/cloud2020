package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping(value = "/testA")
    public String methodA() {
        return "------testA-----------";
    }

    @GetMapping(value = "/testB")
    public String testB() {
        return "------testB-----------";
    }
}
