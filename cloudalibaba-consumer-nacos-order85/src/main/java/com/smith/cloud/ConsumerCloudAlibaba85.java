package com.smith.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerCloudAlibaba85 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerCloudAlibaba85.class,args);
    }
}
