package com.jason.service.feignService;

import com.jason.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: java类作用描述
 * @Author: jasonZhou
 * @CreateDate: 2019/3/15$ 23:21$
 * @UpdateUser: jasonZhou
 * @UpdateDate: 2019/3/15$ 23:21$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
                                            /*断路器*/
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
