package com.ksea.spring.chapter5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {


    @Conditional(value = {WindowsCondition.class})
    @Bean(value = "bill")
    public Person window() {
        System.out.println(" windows ....");
        return new Person("Bill gates", 43);
    }


    @Conditional(value = {LinuxCondition.class})
    @Bean(value = "linux")
    public Person linux() {
        System.out.println(" linux ....");
        return new Person("linus", 46);
    }


}
