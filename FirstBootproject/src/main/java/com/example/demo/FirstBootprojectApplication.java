package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstBootprojectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(FirstBootprojectApplication.class, args);
	Alien a=context.getBean(Alien.class);
	a.alenmethod();
	
	}

}
