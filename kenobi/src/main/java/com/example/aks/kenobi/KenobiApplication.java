package com.example.aks.kenobi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class KenobiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KenobiApplication.class, args);
    }

}

