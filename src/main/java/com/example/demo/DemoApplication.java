package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
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

//	or

//	@GetMapping
//	public List<String> hello(){
//		return List.of("Hello" , "World");
//	}

	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Nitish,",
						"nitish.prabhu26@gmail.com",
						LocalDate.of(1994, Month.OCTOBER,26),
						26
				)
		);
	}
}
