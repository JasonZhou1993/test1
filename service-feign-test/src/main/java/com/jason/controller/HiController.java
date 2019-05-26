package com.jason.controller;

import com.jason.service.feignService.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: jasonZhou
 * @CreateDate: 2019/3/15$ 23:22$
 * @UpdateUser: jasonZhou
 * @UpdateDate: 2019/3/15$ 23:22$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class HiController {


    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
