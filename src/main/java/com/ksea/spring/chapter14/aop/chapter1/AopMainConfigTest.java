package com.ksea.spring.chapter14.aop.chapter1;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMainConfigTest {


    @Test
    public void test() {
        //注册容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopMainConfig.class);

        //获取bean
        MathCalculation mathCalculation = applicationContext.getBean(MathCalculation.class);
        mathCalculation.div(10, 2);


    }
}
