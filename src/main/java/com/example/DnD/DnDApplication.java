package com.example.DnD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DnDApplication {
//campos da chamada JSON transformandos em 0/null ,provavel problema no repositorio
	public static void main(String[] args) {
		SpringApplication.run(DnDApplication.class, args);
	}

}
