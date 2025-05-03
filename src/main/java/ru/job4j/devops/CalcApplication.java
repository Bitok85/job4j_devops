package ru.job4j.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Boot class
 */
@SpringBootApplication
public class CalcApplication {

    /**
     * main method
     *
     * @param args - args array
     */
    public static void main(String[] args) {
        SpringApplication.run(CalcApplication.class, args);
    }
}
