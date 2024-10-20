package com.example.LearnJenkins;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LearnJenkinsApplication {

	private static final Logger log = LoggerFactory.getLogger(LearnJenkinsApplication.class);

	@PostConstruct
	public  void intt()
	{
		log.info("Application started...........");
	}

	public static void main(String[] args) {
		log.info("Application started...........");
		SpringApplication.run(LearnJenkinsApplication.class, args);
	}

}


