package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGuideBatchApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringGuideBatchApplication.class, args);
	    System.exit(SpringApplication.exit(
	            SpringApplication.run(SpringGuideBatchApplication.class, args)));
	}

}
