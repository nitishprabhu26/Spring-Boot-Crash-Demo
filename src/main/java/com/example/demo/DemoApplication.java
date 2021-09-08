package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	This annotation makes this class serve restful endpoints
//	@GetMapping
//	public String hello(){
//		return "Hello World";
//	}

	@GetMapping
	public List<String> hello(){
		return List.of("Hello" , "World");
	}
}
