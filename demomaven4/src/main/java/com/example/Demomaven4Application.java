package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;





//@Configuration
// EnableAutoConfiguration
// component scan

//ComponentScan is to scan @Controller, @Sevice, @Repository,@Configuration
// if yes, create an object of those classess
// and put that object into SpringContext
@SpringBootApplication
public class Demomaven4Application {

	private static ConfigurableApplicationContext context; // belong to class
	private static String[] beans;


	public String[] getBeans(){
		return this.beans;
	}

	public static void main(String[] args) {

 context = SpringApplication.run(Demomaven4Application.class, args);
context.getBean(Demomaven4Application.class);

for(String str : context.getBeanDefinitionNames()){
beans = context.getBeanDefinitionNames();
}

	// 	SpringApplication.run(Demomaven4Application.class, args);
}

}
