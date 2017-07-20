package org.yqj.hystrix.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by yaoqijun on 2017-07-20.
 */
@Component
public class HelloServiceFeignHystrix implements HelloServiceFeign{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry feign " + name;
    }
}
