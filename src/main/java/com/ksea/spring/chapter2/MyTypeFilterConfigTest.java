package com.ksea.spring.chapter2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTypeFilterConfigTest {
    @Test
    public void customTest() {

        AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(MyTypeFilterConfig.class);


    }
}
