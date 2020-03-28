package com.hang.seate.service.impl;

import com.hang.seate.dao.OrderDao;
import com.hang.seate.domain.Order;
import com.hang.seate.service.AccountService;
import com.hang.seate.service.OrderService;
import com.hang.seate.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
     @Resource
     private OrderDao orderDao;
     @Resource
     private AccountService accountService;
     @Resource
     private StorageService storageService;

    /**
     * 创建订单修改 库存 余额
     * @param order
     */
    @Override
    @GlobalTransactional(name = "fsp_tx_group" ,rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("-------->开始创建订单");
        orderDao.create(order);
        log.info("------------->订单微服务开始调用库存，做扣减");

        storageService.decrease(order.getProductId(),order.getCount());
        log.info("------------->订单微服务开始调用库存，做扣减end");

        log.info("------------->订单微服务开始调用账户微服务，做扣减Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------------->订单微服务开始调用账户微服务，做扣减Money end");

        log.info("------------->订单微服务开始调用 修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("------------->订单微服务开始调用 修改订单状态结束");

        log.info("------------>下订单结束 O(∩_∩)O哈哈~");

    }
}
