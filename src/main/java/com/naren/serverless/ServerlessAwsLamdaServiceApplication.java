package com.naren.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.naren.serveless.controller.HelloWorldController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@Import({HelloWorldController.class})
public class ServerlessAwsLamdaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerlessAwsLamdaServiceApplication.class, args);
	}

}
