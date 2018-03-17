package com.ksea.spring.chapter3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {


    @Bean(value = "person")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person person() {
        System.out.println("开始创建..........");
        return new Person("jakcy11", 34);
    }

    @Bean(value = "person_")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person person_() {
        System.out.println("开始创建。。。");
        return new Person("jakcy12", 32);
    }
}
