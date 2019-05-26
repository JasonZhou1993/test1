package com.jason.controller;

import com.jason.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: jasonZhou
 * @CreateDate: 2019/3/15$ 21:44$
 * @UpdateUser: jasonZhou
 * @UpdateDate: 2019/3/15$ 21:44$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}