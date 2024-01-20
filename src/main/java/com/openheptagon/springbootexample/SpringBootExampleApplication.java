package com.openheptagon.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        System.out.println("Program started.");
        SpringApplication.run(SpringBootExampleApplication.class, args);
        System.out.println("Program ended.");
    }

}
