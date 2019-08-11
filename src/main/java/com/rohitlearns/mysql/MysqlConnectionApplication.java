package com.rohitlearns.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class MysqlConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlConnectionApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/topic/**"))
				//.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.rohitlearns"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Topic API",
				"Sample API for learning mysql-DB",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Rohit Penumetsa","https://github.com/rohit14416/mysql-connection.git","rohit.14416@gmail.com"),
				"API License",
				"http://github.com",
				Collections.emptyList());

	}

}
