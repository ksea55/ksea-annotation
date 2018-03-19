package com.ksea.spring.chapter10.lifeCycle3;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 通过JSR250,JAVA提供的规范，注解方法是来进行对象的初始化与对象销毁
 *
 * @PostConstruct 对象创建完成并赋值完成之后进行调用
 * @PreDestroy对象移除之前进行销毁
 */
@Component
public class Student {

    public Student() {
        System.out.println("对象创建完成...........");
    }


    @PreDestroy //对象移除之前进行销毁
    public void preDestroy() throws Exception {

        System.out.println("正在执行 @PreDestroy 注解提供的销毁对象. ");
    }

    @PostConstruct //对象创建完成并赋值完成之后进行调用
    public void postConstruct() throws Exception {
        System.out.println("正在执行 @PostConstruct 注解提供的初始化.");


    }
}
