package seate.storage.service.doMain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Version 1.0
 * @Author:杭利达
 * @Date:2020/3/27
 * @Content:
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
