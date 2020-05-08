package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.JsonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String port;

    @PostMapping(value = "/payment/create")
    public JsonResult<Payment> create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    @GetMapping(value = "/payment/get/{id}")
    public JsonResult get(@PathVariable("id") Long id) {
        return paymentService.getPaymentById(id);
    }

    @GetMapping("/payment/lb")
    public String lb(){
        return port;
    }
}
