package com.example.DnD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DnDApplication {

	public static void main(String[] args) {
		SpringApplication.run(DnDApplication.class, args);
	}

}
