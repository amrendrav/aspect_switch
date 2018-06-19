package com.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AspectSwitchApplication {

	public static void main(String[] args) {

		System.setProperty("a2c.feature", "false");
		SpringApplication.run(AspectSwitchApplication.class, args);
	}
}
