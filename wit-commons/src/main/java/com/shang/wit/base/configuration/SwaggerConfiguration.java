package com.shang.wit.base.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 系统基础信息类 - Swagger 接口文档生成框架配置类
 * 文档启动地址 http://localhost:8080/swagger-ui/index.html
 * @author shang
 * @version 1.0.0
 */
@Configuration
public class SwaggerConfiguration {
	@Bean
	public Docket createAPI(){
		return new Docket(DocumentationType.SWAGGER_2).
				//设置生成文档的相关信息
				apiInfo(apiInfo())
				//设置swagger 注解扫描位置
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.shang.wit"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo(){
		return new ApiInfoBuilder().
				//生成文档标题
				title("智慧医疗信息平台接口文档").
				version("1.0.0").
				contact(new Contact("shang", "wit.shang.com","shangdangpengpp@163.com")).
				build();

	}
}
