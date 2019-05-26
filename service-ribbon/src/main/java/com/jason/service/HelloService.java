package com.jason.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: java类作用描述
 * @Author: jasonZhou
 * @CreateDate: 2019/3/15$ 21:43$
 * @UpdateUser: jasonZhou
 * @UpdateDate: 2019/3/15$ 21:43$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /*该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法*/
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}
