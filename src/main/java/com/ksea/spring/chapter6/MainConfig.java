package com.ksea.spring.chapter6;

import com.ksea.spring.chapter5.LinuxCondition;
import com.ksea.spring.chapter5.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = StudentService.class)
@Configuration
public class MainConfig {


    public Person person() {
        System.out.println(" create  ....");
        return new Person("Bill gates", 43);
    }


}
