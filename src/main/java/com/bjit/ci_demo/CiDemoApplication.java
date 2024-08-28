package com.bjit.ci_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiDemoApplication.class, args);

		System.out.println("CI project test");
		System.out.println("Update message");
	}

}
