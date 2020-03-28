package seate.storage.service.service;

import org.apache.ibatis.annotations.Param;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease( Long productId,  Integer count);
}
