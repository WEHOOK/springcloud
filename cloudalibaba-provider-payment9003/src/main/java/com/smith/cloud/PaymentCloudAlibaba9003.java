package com.smith.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentCloudAlibaba9003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentCloudAlibaba9003.class,args);
    }
}
