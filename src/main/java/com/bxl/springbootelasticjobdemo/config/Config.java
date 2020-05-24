package com.bxl.springbootelasticjobdemo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("config")
public class Config {

    @Value("${default.bxl.paramter}")
    private String env;


    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }


}
