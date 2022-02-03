package com.example.IamFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IamFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(IamFirstApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<h1>Hello Tilek and All students!</h1>";
	}

}

