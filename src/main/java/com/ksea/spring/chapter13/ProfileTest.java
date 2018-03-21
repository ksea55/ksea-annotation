package com.ksea.spring.chapter13;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;

public class ProfileTest {


    @Test
    public void test1() {
        //第一种方式 ：-Dspring.profiles.active=dev 在运行时候 添加该参数
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProfileMainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);

    }

    @Test
    public void test2() {
        //通过代码的方式来切换环境
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //切换环境注册
        applicationContext.getEnvironment().addActiveProfile("dev");
        //注册配置类
        applicationContext.register(ProfileMainConfig.class);
        //刷新容器
        applicationContext.refresh();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
    }
}
