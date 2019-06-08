package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.app.*")
public class SampleappApplication {

	private static final Logger logger = LoggerFactory.getLogger(SampleappApplication.class);

	public static void main(String[] args) {
		logger.info("Hello World ");
		SpringApplication.run(SampleappApplication.class, args);
	}

}
