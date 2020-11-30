package com.zry.timmer;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@MapperScan("com.zry.timmer.dao")
public class TimmerApplication /*extends SpringBootServletInitializer*/ {

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意：这里要指向SpringBoot的引导类
        return builder.sources(TimmerApplication.class);
    }*/

    public static void main(String[] args) {

        SpringApplication.run(TimmerApplication.class, args);
    }

}
