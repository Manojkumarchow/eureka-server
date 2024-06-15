package com.eureka.proxy.eureka_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProxyApplication.class, args);
	}

}
