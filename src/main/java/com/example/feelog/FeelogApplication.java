package com.example.feelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(basePackages = "com.example.feelog.Repository")
@EntityScan(basePackages = "com.example.feelog.Entity")
public class FeelogApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeelogApplication.class, args);
    }

}
