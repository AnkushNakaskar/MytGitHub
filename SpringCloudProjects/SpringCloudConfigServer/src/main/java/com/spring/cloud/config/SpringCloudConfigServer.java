package com.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class SpringCloudConfigServer {
	public static void main(String[] args) {
		System.out.println(".....Starting application....");
		SpringApplication.run(SpringCloudConfigServer.class, args);
	}
}
