package com.oone.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.oone")
public class OOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OOneApplication.class, args);
    }
}
