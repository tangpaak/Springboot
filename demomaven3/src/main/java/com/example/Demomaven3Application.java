package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

//@Configuration
// EnableAutoConfiguration
// component scan

//ComponentScan is to scan @Controller, @Sevice, @Repository,@Configuration
// if yes, create an object of those classess
// and put that object into SpringContext

public class Demomaven3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demomaven3Application.class, args);
	}

}
