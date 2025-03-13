package edu.datnx.SB_BMI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.datnx")
public class SbBmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbBmiApplication.class, args);
	}

}
