package com.jason.hystric;

import com.jason.service.feignService.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Description: java类作用描述
 * @Author: jasonZhou
 * @CreateDate: 2019/3/16$ 0:23$
 * @UpdateUser: jasonZhou
 * @UpdateDate: 2019/3/16$ 0:23$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
  /*断路器*/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
