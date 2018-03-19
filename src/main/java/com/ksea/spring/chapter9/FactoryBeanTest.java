package com.ksea.spring.chapter9;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {


    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        // 此处当StudentFactoryBean工厂中其issingleton返回的是false，这是prototype作用域，其实多实例模式，没调用一次就创建一次，true作用域是singleton单例模式，容器中只会创建一次
        Object bean1 = applicationContext.getBean("studentFactoryBean");
        Object bean2 = applicationContext.getBean("studentFactoryBean");

        System.out.println(bean1.getClass()); //此处打印的是工厂bean创建的类型 class com.ksea.spring.chapter9.Student,也就是StudentFactoryBean中getObjectType返回的类型

        System.out.println(bean1 == bean2);


        //当我们需要获取工厂本身返回的类 也就是studentFactoryBean只需要再前面前面加上&

        Object bean3 = applicationContext.getBean("&studentFactoryBean");
        System.out.println(bean3.getClass());//此处返回的结果 -->class com.ksea.spring.chapter9.StudentFactoryBean


    }

}
