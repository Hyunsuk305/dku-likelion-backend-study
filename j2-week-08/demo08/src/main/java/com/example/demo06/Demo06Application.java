package com.example.demo06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Demo06Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo06Application.class, args);
	}

}
