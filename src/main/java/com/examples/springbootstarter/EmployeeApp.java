package com.examples.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan("com.examples.springbootstarter.employees")
@SpringBootApplication
public class EmployeeApp {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApp.class,args);
    }
}
