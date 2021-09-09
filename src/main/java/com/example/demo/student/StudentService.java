package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // says that its a class that has to be instantiated
public class StudentService {
    public List<Student> getStudents(){
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
