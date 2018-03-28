package com.ksea.spring.chapter16;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationListenerTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        applicationContext.close();
    }


    @Test
    public void test1() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        //发布自己的时间
        applicationContext.publishEvent(new MyApplictionEvent("自定义事件.........."));

        applicationContext.close();
    }
}
