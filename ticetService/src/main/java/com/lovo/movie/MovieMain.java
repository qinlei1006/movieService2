package com.lovo.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieMain {
    public static void main(String[] args) {
        SpringApplication.run(MovieMain.class);
    }
}
