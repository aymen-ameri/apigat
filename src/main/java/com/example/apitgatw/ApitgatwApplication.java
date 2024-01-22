package com.example.apitgatw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApitgatwApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApitgatwApplication.class, args);
	}

}
