package org.yqj.hystrix.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yqj.hystrix.demo.service.HelloService;
import org.yqj.hystrix.demo.service.HelloServiceFeign;

/**
 * Created by yaoqijun on 2017-07-20.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private HelloServiceFeign helloServiceFeign;

    @RequestMapping(value = "/hi_ribbon")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hi_feign")
    public String hi2(@RequestParam String name){
        return helloServiceFeign.sayHiFromClientOne(name);
    }
}
