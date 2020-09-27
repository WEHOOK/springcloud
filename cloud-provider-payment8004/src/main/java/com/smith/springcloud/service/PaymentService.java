package com.smith.springcloud.service;

import com.smith.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author gaoyu
 * @date 2020-09-23
 * @description
 */
public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}

