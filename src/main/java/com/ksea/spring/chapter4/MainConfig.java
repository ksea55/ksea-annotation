package com.ksea.spring.chapter4;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {


    @Bean(value = "person")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Lazy //懒加载组件
    public Person person() {
        System.out.println("开始创建..........");
        return new Person("jakcy11", 34);
    }

}
