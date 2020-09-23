package com.smith.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gaoyu
 * @date 2020-09-22
 * @description
 */
@EnableEurekaClient
@SpringBootApplication
public class PayMentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayMentApplication.class,args);
    }
}
