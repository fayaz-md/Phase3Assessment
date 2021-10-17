package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages="com")
@EntityScan(basePackages="com.bean")
public class Phase3AssessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3AssessmentApplication.class, args);
	}

}
