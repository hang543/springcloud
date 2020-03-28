package com.hang.seate.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
public interface AccountService {
    /**
     * 扣减余额
     * @param userId
     * @param money
     */
    void decrease(Long userId, BigDecimal money);
}
