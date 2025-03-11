package edu.datnx.SB_TruyenDuLieuSangView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.datnx")
public class SB_TruyenDuLieuSangView {

	public static void main(String[] args) {
		SpringApplication.run(SB_TruyenDuLieuSangView.class, args);
	}

}
