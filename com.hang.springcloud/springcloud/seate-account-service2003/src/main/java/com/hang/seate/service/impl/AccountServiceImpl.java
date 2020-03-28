package com.hang.seate.service.impl;

import com.hang.seate.dao.AccountDao;
import com.hang.seate.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money){
        log.info("------->开始扣除余额");
        accountDao.decrease(userId,money);
        log.info("------->扣除余额完成");

    }
}
