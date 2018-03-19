package com.ksea.spring.chapter10.lifeCycle3;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    @Test
    public void test() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC创建完成.............");

        applicationContext.close();
        System.out.println("IOC 容器关闭....");
        /**
         *
         * 打印结果:
         * 对象创建完成...........
         正在执行 @PostConstruct 注解提供的初始化.
         IOC创建完成.............
         正在执行 @PreDestroy 注解提供的销毁对象.
         IOC 容器关闭....
         *
         *
         */
    }
}
