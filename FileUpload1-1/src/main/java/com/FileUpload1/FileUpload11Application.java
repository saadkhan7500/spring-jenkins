package com.FileUpload1;



import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class FileUpload11Application {

	
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(FileUpload11Application.class);
	
	@PostConstruct
	public void intt()
	{
		logger.info("application started.....");
	}
	public static void main(String[] args) {
		
		logger.info("application is running....");
		SpringApplication.run(FileUpload11Application.class, args);
	}

}
