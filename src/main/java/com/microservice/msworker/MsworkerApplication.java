package com.microservice.msworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsworkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsworkerApplication.class, args);
	}

}
