package com.ksea.spring.chapter1;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {


    @Test
    public void xmlApplicationContextTest() {
        /**
         *
         * 从beans.xml
         * <bean id="person" class="com.ksea.spring.chapter1.Person">
         <property name="name" value="张三"/>
         <property name="age" value="21"/>
         </bean>
         *
         * 这是spring ioc通过xml的方式注入bean的方式
         */

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ksea/spring/chapter1/beans.xml");
        Object person = applicationContext.getBean("person");
        System.out.println(person);

    }

    /**
     * 通过直接的方式开进行ioc的注入
     */
    @Test
    public void aonnotationApplicationContextTest() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = applicationContext.getBean("person");
        System.out.println(person);  //打印结果:Person{name='jacky', age='44'}


        //查看bean定义的名称
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
        System.out.println("-----------------------------------------------");
        //根据类型查看其bean定义的名称,这里其实是根据其方法名
        String[] beanNamesForType = applicationContext.getBeanNamesForType(person.getClass());
        for (String name : beanNamesForType) {
            System.out.println(name); //打印person
        }


    }

}
