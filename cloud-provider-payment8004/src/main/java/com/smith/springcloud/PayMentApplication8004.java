package com.smith.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gaoyu
 * @date 2020-09-22
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PayMentApplication8004 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentApplication8004.class,args);
    }
}
