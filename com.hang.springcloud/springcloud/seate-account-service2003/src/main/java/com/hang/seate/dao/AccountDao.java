package com.hang.seate.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
@Mapper
public interface AccountDao {
    /**
     * 账户扣减
     * @param userId
     * @param money
     */
    void decrease(@Param("userId")Long userId, @Param("money") BigDecimal money);
}
