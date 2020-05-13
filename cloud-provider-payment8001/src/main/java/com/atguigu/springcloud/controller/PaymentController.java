package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.JsonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PaymentController {

    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/create")
    public JsonResult<Payment> create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    @GetMapping(value = "/payment/get/{id}")
    public JsonResult get(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        services.forEach(s -> logger.info("----element:------" + s));
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(s -> {
            logger.info(s.getInstanceId() + "\t" + s.getHost() + "\t" + s.getPort() + "\t" + s.getUri());
        });
        return this.discoveryClient;
    }

    @GetMapping("/payment/lb")
    public String lb() {
        return port;
    }

    @GetMapping("/payment/feign/timeout")
    public String timeOut() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return port;
    }

    @GetMapping("/payment/zipkin")
    public String zipkin() {
        return "Hello,I'am zipkin server fallback.";
    }
}
