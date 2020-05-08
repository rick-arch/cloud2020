package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.JsonResult;
import com.atguigu.springcloud.entities.Payment;

public interface PaymentService {

    JsonResult create(Payment payment);

    JsonResult getPaymentById(Long id);
}
