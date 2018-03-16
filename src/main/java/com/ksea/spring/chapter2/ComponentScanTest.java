package com.ksea.spring.chapter2;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class ComponentScanTest {

    /**
     * 采用默认xml配置的方式进行包组件扫描
     */
    @Test
    public void xmlComponetScanTest() {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ksea/spring/chapter2/beans.xml");
        //获取所有bean的定义的名称
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
        /**
         *
         *
         * studentController
         studentDao
         studentService
         org.springframework.context.annotation.internalConfigurationAnnotationProcessor
         org.springframework.context.annotation.internalAutowiredAnnotationProcessor
         org.springframework.context.annotation.internalRequiredAnnotationProcessor
         org.springframework.context.annotation.internalCommonAnnotationProcessor
         org.springframework.context.event.internalEventListenerProcessor
         org.springframework.context.event.internalEventListenerFactory
         打印结果:是扫描了所有包
         *
         */
    }


    @Test
    public void annotationApplicationContextTest() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(definitionNames).forEach(System.out::println);


    }

}
