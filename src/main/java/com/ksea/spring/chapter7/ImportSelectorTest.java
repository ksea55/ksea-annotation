package com.ksea.spring.chapter7;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ImportSelectorTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(definitionNames).forEach(System.out::println);


        Blue blue = applicationContext.getBean(Blue.class);
        System.out.println(blue);
    }
}
