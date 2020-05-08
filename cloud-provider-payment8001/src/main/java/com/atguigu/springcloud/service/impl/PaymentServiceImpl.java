package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.JsonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.repository.PaymentRepository;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentRepository paymentRepository;

    @Value("${server.port}")
    private String port;

    @Override
    public JsonResult create(Payment payment) {
        int result = paymentRepository.create(payment);
        if (result > 0) {
            return new JsonResult(200, "数据插入成功,端口："+port, result);
        }
        return new JsonResult(444, "数据插入失败", null);
    }

    @Override
    public JsonResult getPaymentById(Long id) {
        Payment payment = paymentRepository.getPaymentById(id);

        if (payment != null) {
            return new JsonResult(200, "数据查询成功，端口："+port, payment);
        }
        return new JsonResult(444, "没有对应记录，查询id：" + id, null);
    }
}
