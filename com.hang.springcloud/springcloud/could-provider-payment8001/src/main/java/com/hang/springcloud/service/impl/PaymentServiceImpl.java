package com.hang.springcloud.service.impl;

import com.hang.springcloud.dao.PaymentDao;
import com.hang.springcloud.entities.Payment;
import com.hang.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/19
 * @Content:
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
