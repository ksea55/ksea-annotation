package com.ksea.spring.chapter9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {


    @Bean(value = "studentFactoryBean")
    public StudentFactoryBean studentFactoryBean() {

        return new StudentFactoryBean();
    }

}
