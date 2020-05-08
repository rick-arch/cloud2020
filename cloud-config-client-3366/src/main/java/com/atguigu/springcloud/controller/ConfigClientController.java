package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    String configInfo;

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/configInfo")
    public String getConfigInfoAndPort() {
        return "Port:" + port + ",configInfo:" + configInfo;
    }
}
