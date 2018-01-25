package com.ocly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulMiyaApplication.class, args);
	}

	@GetMapping("/")
	public String say(){
		return "hi consul";
	}
}
