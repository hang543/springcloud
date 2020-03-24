package com.hang.springcloud.dao;

import com.hang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/19
 * @Content:
 **/
@Mapper
public interface PaymentDao {
    public int  create(Payment payment);
    public  Payment getPaymentById(@Param("id")Long id);
}
