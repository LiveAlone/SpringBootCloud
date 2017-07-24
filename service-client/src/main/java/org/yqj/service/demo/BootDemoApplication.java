package org.yqj.service.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by yaoqijun.
 * Date:2016-04-27
 * Email:yaoqj@terminus.io
 * Descirbe:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BootDemoApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .banner(new DemoBanner())
                .sources(BootDemoApplication.class)
                .run(args);
    }

    @Bean
    public CommandLineRunner runner(DiscoveryClient discoveryClient){
        return args ->
            discoveryClient.getInstances("SERVICE-HI")
                    .forEach(serviceInstance -> System.out.println(
                            String.format("Found %s %s:%s", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort())));

    }
}
