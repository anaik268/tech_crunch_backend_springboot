package com.hackathon.techcrunch.closetapp;

import com.hackathon.techcrunch.closetapp.data.repository.ClosetRepository;
import com.hackathon.techcrunch.closetapp.service.ClosetApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan()
@SpringBootApplication
public class ClosetAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClosetAppApplication.class, args);
	}
}
