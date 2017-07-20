package org.yqj.feign.demo;

import org.springframework.stereotype.Component;

/**
 * Created by yaoqijun on 2017-07-20.
 */
@Component
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
