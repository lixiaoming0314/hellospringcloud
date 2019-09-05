package com.example.hellocloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.hellocloud.mapper")
@SpringBootApplication
public class HellocloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellocloudApplication.class, args);
    }

}
