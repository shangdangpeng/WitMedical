package com.shang.wit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 智慧医疗信息平台 - 系统基础服务功能启动类
 * @author shang
 * @version 1.0.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class WitSystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(WitSystemConsumerStarter.class, args);
	}
}
