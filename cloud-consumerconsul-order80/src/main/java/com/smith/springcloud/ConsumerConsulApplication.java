package com.smith.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gy
 * @date 2020-09-23
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulApplication.class,args);
    }
}
