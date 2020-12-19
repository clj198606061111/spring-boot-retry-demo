package com.itclj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class ItcljApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItcljApplication.class,args);
    }
}
