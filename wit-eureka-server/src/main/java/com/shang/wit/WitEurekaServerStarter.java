package com.shang.wit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 智慧医疗信息平台 - 注册中心启动类
 * @author shang
 * @version 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class WitEurekaServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(WitEurekaServerStarter.class, args);
	}
}
