package com.shang.wit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 智慧医疗信息平台 - 系统基础服务功能启动类
 * @author shang
 * @version 1.0.0
 */
@MapperScan("com.shang.wit.*.*.dao")
@EnableEurekaClient
@SpringBootApplication
public class WitSystemProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(WitSystemProviderStarter.class, args);
	}
}
