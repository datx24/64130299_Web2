package edu.datnx.ChaoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.datnx.controllers"})
public class ChaoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaoSpringBootApplication.class, args);
	}

}
