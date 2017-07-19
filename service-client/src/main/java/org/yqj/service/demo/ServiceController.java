package org.yqj.service.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaoqijun on 2017/7/11.
 */
@RestController
public class ServiceController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "v1/hi")
    public String version1HI(@RequestParam String name){
        return "hi " + name + " i am from " +" application : " + applicationName + " port: " + port;
    }

    @RequestMapping(value = "v2/hi")
    public String version2HI(@RequestParam String name){
        return "hi " + name + " i am from " +" application : " + applicationName + " port: " + port;
    }
}
