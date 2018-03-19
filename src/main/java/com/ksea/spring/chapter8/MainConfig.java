package com.ksea.spring.chapter8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MainConfig {


    @Bean(value = "red")
    public Red red() {
        return new Red();
    }

    @Bean(value = "blue")
    public Blue blue() {
        return new Blue();
    }
}
