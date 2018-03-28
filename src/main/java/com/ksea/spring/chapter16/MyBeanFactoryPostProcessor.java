package com.ksea.spring.chapter16;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//注入到容器中
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println("开始执行....MyBeanFactoryPostProcessor....中的postProcessBeanFactory.....");

        //获取定义bean的个数
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        //获取定义的bean的名称
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

        System.out.println("在MyBeanFactoryPostProcessor中定义的bean的个数:" + beanDefinitionCount + ",所定义的具体bean是:" + Arrays.asList(beanDefinitionNames));
    }
}
