package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMongoDbApplication.class, args);
		System.out.println("SpringBoot-MongoDB-Integration--Starts");
	}

}
