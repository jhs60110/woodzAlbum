package com.woodz.love;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LoveApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveApplication.class, args);
	}

}
