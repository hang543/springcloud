package seate.storage.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seate.storage.service.doMain.CommonResult;
import seate.storage.service.service.StorageService;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){
      storageService.decrease(productId, count);
      return new CommonResult(200,"库存扣件成功");
    }
}
