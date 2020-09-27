package com.smith.springcloud.service.impl;


import com.smith.springcloud.dao.PaymentDao;
import com.smith.springcloud.entites.Payment;
import com.smith.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gaoyu
 * @date 2020-09-23
 * @description
 */
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
