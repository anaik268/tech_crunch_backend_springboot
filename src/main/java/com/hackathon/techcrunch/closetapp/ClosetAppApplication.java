package com.hackathon.techcrunch.closetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class ClosetAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClosetAppApplication.class, args);
	}
}
