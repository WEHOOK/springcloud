package com.smith.springcloud;

import com.smith.springcloud.lb.MyLb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author gy
 * @date 2020-09-23
 * @description
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MyLb.class)
public class ConsumerMyRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMyRibbonApplication.class,args);
    }
}
