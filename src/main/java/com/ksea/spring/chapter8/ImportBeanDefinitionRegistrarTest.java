package com.ksea.spring.chapter8;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ImportBeanDefinitionRegistrarTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(definitionNames).forEach(System.out::println);

        //获取到手动注入到的bean
        Object color = applicationContext.getBean("color");

        System.out.println(color);
    }
}
