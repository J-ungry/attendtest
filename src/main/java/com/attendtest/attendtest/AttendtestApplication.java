package com.attendtest.attendtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AttendtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendtestApplication.class, args);
    }

}
