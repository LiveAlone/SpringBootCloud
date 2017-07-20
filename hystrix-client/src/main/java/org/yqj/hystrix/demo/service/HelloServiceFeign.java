package org.yqj.hystrix.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yaoqijun on 2017-07-20.
 */
@FeignClient(value = "SERVICE-HI", fallback = HelloServiceFeignHystrix.class)
public interface HelloServiceFeign {

    @RequestMapping(value = "/v1/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
