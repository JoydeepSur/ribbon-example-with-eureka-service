package com.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RibbonExampleWithEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonExampleWithEurekaServiceApplication.class, args);
	}

}
