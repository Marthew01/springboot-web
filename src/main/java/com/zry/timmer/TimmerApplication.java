package com.zry.timmer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zry.timmer.dao")
public class TimmerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimmerApplication.class, args);
    }

}
