package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//To see the memory used and stuff like that using ham browser go to localhost:8080 and type actuator in the textbox
//This is done by Spring Actuator.

@SpringBootApplication //Indicates that this is a spring application, also enables autoconfiguration and automatic component scan.
public class SpringbootIn10StepsApplication {
	//SpringApplication.run method runs a Spring context. Here we provide  spring context as an arguement. 
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		for (String name : applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}

}
