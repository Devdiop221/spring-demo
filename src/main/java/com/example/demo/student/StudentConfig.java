package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marie = new Student(
                    "Marie",
                    "marie@gmail.com",
                    LocalDate.of(2005, Month.FEBRUARY, 15)
            );

            Student aicha = new Student(
                    "Aicha",
                    "fatou@gmail.com",
                    LocalDate.of(2006, Month.APRIL, 25)
            );

            repository.saveAll(
                    List.of(marie,aicha)
            );
        };
    }
}
