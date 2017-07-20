package org.yqj.feign.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yaoqijun on 2017-07-20.
 */
@FeignClient(value = "service-hi", fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(value = "/v1/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
