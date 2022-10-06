package com.fareye.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingApplication {

	public static void main(String[] args) {
		System.out.println("hello FarEye");
		SpringApplication.run(TrainingApplication.class, args);
	}

}
