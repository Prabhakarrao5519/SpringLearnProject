package com.example.GalgotiasApp.prabhakar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springBootConfig {
    @Bean("student1")
    public Student getStudent1(){

        return new Student(1, "abs", 90);
    }

}
