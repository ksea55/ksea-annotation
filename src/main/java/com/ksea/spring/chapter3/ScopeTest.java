package com.ksea.spring.chapter3;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

    @Test
    public void scopeToSingletonXml() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ksea/spring/chapter3/beans.xml");

        Object person1 = applicationContext.getBean("person");

        Object person2 = applicationContext.getBean("person");


        System.out.println(person1 == person2); //结果:true

        /**
         *
         * 继续xml的方式，我们可以看到在spring其作用域 默认是单例模式singleton,当IOC容器创建的时候，该类就被创建
         *
         */

    }

    @Test
    public void scopeToPrototypeXml() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ksea/spring/chapter3/beans.xml");

        Object person1 = applicationContext.getBean("person_");

        Object person2 = applicationContext.getBean("person_");


        System.out.println(person1 == person2); //结果:false

        /**
         *
         * 继续xml的方式，prototype 多实例模式，它在ioc容器创建的时候不会创建，而是ioc在调用的时候才创建，每调用一次就创建一次
         *
         */

    }


    @Test
    public void scopeSingletonToAnnotationTest() {

        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);


    }


    @Test
    public void scopePrototypeToAnnotationTest() {

        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);

        Object person_ = applicationContext.getBean("person_");
    }
}
