package com.smith.springcloud.dao;

import com.smith.springcloud.entites.CommonResult;
import com.smith.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author gaoyu
 * @date 2020-09-22
 * @description
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);


}
