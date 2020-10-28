package com.smith.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMainCloudAlibaba9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainCloudAlibaba9002.class,args);
    }
}
