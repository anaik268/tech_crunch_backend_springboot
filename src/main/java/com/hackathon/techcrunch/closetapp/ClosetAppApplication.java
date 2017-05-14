package com.hackathon.techcrunch.closetapp;

import com.hackathon.techcrunch.closetapp.config.SpringCouchbaseApplicationConfig;
import com.hackathon.techcrunch.closetapp.data.repository.ClosetRepository;
import com.hackathon.techcrunch.closetapp.service.ClosetService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;
import java.util.List;

@ComponentScan( basePackageClasses = {ClosetRepository.class, ClosetService.class})
@SpringBootApplication
@ComponentScan(basePackageClasses = {SpringCouchbaseApplicationConfig.class})
public class ClosetAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClosetAppApplication.class, args);
	}

}
