package com.codespace.EasyBasket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.codespace.EasyBasket")
@EnableJpaRepositories(basePackages = "com.codespace.EasyBasket.repository")
@EntityScan(basePackages = "com.codespace.EasyBasket.model")
public class EasybasketApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasybasketApplication.class, args);
    }
}