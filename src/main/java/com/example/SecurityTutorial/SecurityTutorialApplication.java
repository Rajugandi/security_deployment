package com.example.SecurityTutorial;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityTutorialApplication {


	public static Logger logger = LoggerFactory.getLogger(SecurityTutorialApplication.class);

//	@PostConstruct
//	public void intt(){
//		Logger.info("Application started...");
//	}




	public static void main(String[] args) {
//		Logger.info("Application executed...");
		SpringApplication.run(SecurityTutorialApplication.class, args);
	}

}
