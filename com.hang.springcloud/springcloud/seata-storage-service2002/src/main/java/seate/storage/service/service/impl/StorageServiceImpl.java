package seate.storage.service.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import seate.storage.service.dao.StorageDao;
import seate.storage.service.service.StorageService;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("---------->开始进行库存扣减");
        storageDao.decrease(productId,count);
        log.info("-------------->库存扣减完成");
    }
}
