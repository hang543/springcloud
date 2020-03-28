package com.hang.seate.controller;

import com.hang.seate.doMain.CommonResult;
import com.hang.seate.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
@RestController
public class AccountController {
    @Resource
    private AccountService accountService;
    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
         try {
                     TimeUnit.SECONDS.sleep(20);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
      accountService.decrease(userId,money);
      return new CommonResult(200,"扣款成功");
    }
}
