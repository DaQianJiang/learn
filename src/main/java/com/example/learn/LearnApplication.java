package com.example.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

//@MapperScan("com.example.learn.mapper")
//public class LearnApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(LearnApplication.class, args);
//    }
//
//
//
//}

public class LearnApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LearnApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LearnApplication.class, args);
    }



}

