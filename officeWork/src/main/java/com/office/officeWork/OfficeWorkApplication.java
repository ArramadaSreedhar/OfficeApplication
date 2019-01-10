package com.office.officeWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value="com.office")
@SpringBootApplication
public class OfficeWorkApplication {

	public static void main(String[] args) {
		System.out.println("Hello Sreedhar");
		SpringApplication.run(OfficeWorkApplication.class, args);
	}

}

