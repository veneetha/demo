package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Autowired
    StudentRepository studentRepository;
    @Bean
    CommandLineRunner commandLineRunner (){
        return  args -> {
            Student student1= new Student( "Student1", LocalDate.of(1993,02,23),29,"vineetha.chevula@gmail.com");
            Student student2= new Student( "Student2", LocalDate.of(1993,11,02),29,"veneetha.chevula@gmail.com");
          studentRepository.saveAll(List.of(student1,student2));
        };

    }
}
