package com.ghozay19.buku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableJpaRepositories
//@Component
public class BookApplication {
    public static void main(String[] args){
        SpringApplication.run(BookApplication.class,args);
    }
}
