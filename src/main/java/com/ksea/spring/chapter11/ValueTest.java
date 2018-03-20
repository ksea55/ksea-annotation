package com.ksea.spring.chapter11;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {

    @Test
    public void xml() {
        //基于xml的方式给bean赋值，我们是通过value
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ksea/spring/chapter11/beans.xml");
        Object person = applicationContext.getBean("person");
        System.out.println(person); //Person{name='jacky', age=21}
    }

    @Test
    public void annotation() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person); //Person{name='mexican', age=19}


    }

}
