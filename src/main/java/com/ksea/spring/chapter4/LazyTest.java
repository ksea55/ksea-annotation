package com.ksea.spring.chapter4;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyTest {
    @Test
    public void lazyXmltest() {
        ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/ksea/spring/chapter4/beans.xml");

    }

    @Test
    public  void  lazyAnnotationTest(){
        AnnotationConfigApplicationContext applicationContext= new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = applicationContext.getBean("person");
        Object person1 = applicationContext.getBean("person");
        System.out.println(person==person1);  //从结果看只打印了一次
    }
}
