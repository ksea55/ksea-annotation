package com.ksea.spring.chapter16;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor 它是BeanFactoryPostProcessor子接口
 * <p>
 * BeanDefinitionRegistryPostProcessor中的postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry);方法
 * 在所有bean定义信息将要被加载，bean实例还未创建的执行
 * <p>
 * 优先于BeanFactoryPostProcessor执行；
 * 利用BeanDefinitionRegistryPostProcessor给容器中再额外添加一些组件；，如我们注册的Person
 * <p>
 * 原理：
 * 1）、ioc创建对象
 * 2）、refresh()-》invokeBeanFactoryPostProcessors(beanFactory);
 * 3）、从容器中获取到所有的BeanDefinitionRegistryPostProcessor组件。
 * 1、依次触发所有的postProcessBeanDefinitionRegistry()方法
 * 2、再来触发postProcessBeanFactory()方法BeanFactoryPostProcessor；
 * <p>
 * 4）、再来从容器中找到BeanFactoryPostProcessor组件；然后依次触发postProcessBeanFactory()方法
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    /**
     * BeanDefinitionRegistry:bean定义注册器，它包含了所有bean定义的信息，bean的id，bean的类型等，
     * beanFactory创建类的的信息都来源于BeanDefinitionRegistry
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        //获取bean定义的个数
        int beanDefinitionCount = registry.getBeanDefinitionCount();

        //获取bean定义的名称信息
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();


        System.out.println("开始执行MyBeanDefinitionRegistryPostProcessor中的postProcessBeanDefinitionRegistry,....bean个数:" + beanDefinitionCount + ",bean名称:" + Arrays.asList(beanDefinitionNames));


        //第一种方式通过  RootBeanDefinition 注册bean
        //RootBeanDefinition beanDefinition = new RootBeanDefinition();
        //beanDefinition.setBeanClass(Person.class);

        //第二种方式通过BeanDefinitionBuilder来注册
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();
        //定义我们自己的bean进行注册
        registry.registerBeanDefinition("person", beanDefinition);


    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println("开始执行 MyBeanDefinitionRegistryPostProcessor 中的 postProcessBeanFactory方法,获得bean定义的个数是:" + beanFactory.getBeanDefinitionCount());
    }
}
