package com.ksea.spring.chapter10.lifeCycle1;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {


    /**
     * initMethod调用初始化方法
     * destroyMethod调用对象销毁方法
     *
     * @return
     */
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    @Bean(value = "student", initMethod = "init", destroyMethod = "detory") //通过@Bean注解对其进行IOC容器注入
    public Student student() {

        return new Student();
    }


    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    @Bean(value = "stu", initMethod = "init", destroyMethod = "detory") //通过@Bean注解对其进行IOC容器注入
    public Student student_() {
        System.out.println("执行prototype多实例作用域...");
        return new Student();
    }
}
