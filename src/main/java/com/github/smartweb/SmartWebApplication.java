package com.github.smartweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author db1995
 */
@SpringBootApplication
public class SmartWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartWebApplication.class, args);
    }
}
