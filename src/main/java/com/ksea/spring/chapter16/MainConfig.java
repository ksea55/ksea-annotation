package com.ksea.spring.chapter16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value = {"com.ksea.spring.chapter16"})//扫描组件
@Configuration
public class MainConfig {
    /**
     * BeanPostProcessor:bean的后置处理器，在bean初始化前后进行执行
     * BeanFactoryPostProcessor: beanFactory后置处理器,它是在bean初始化前进行执行，具体在bean已经定义加载，但是还没被实例化
     * 1:IOC初始化
     * 2:invokeBeanFactoryPostProcessors(beanFactory);
     * 源码注释
     * Modify the application context's internal bean factory after its standard
     * initialization. All bean definitions will have been loaded, but no beans
     * will have been instantiated yet. This allows for overriding or adding
     * properties even to eager-initializing beans.
     * <p>
     * beanFactory the bean factory used by the application context
     *
     * @throws org.springframework.beans.BeansException in case of errors
     */


    @Bean
    public Student student() {

        return new Student();
    }

}
