package com.ksea.spring.chapter11;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ColorTest {
    @Test
    public void annotation() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ColorMainConfig.class);
        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);


    }
}
