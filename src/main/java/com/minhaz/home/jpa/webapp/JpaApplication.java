package com.minhaz.home.jpa.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.minhaz.home.jpa"})
@EntityScan(basePackages = {"com.minhaz.home.jpa.entity"})
@EnableJpaRepositories(basePackages = {"com.minhaz.home.jpa.repository"})
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

}
