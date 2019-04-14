package com.administration.apply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdministrationApplyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministrationApplyApplication.class, args);
	}

}
