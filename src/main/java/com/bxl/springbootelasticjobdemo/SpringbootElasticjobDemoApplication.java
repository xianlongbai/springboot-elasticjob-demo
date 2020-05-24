package com.bxl.springbootelasticjobdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-elasticjob.xml")
public class SpringbootElasticjobDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootElasticjobDemoApplication.class, args);
    }

}
