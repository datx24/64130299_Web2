package edu.datnx.SB_Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "edu.datnx.controllers")
@SpringBootApplication
public class SbLoginApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbLoginApplication.class, args);
	}

}
