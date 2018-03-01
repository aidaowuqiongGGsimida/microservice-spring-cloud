package com.zj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServerEurekaApplication.class, args);
	}
}
