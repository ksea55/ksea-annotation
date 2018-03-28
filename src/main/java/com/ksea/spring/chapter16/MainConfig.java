package com.ksea.spring.chapter16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value = {"com.ksea.spring.chapter16"})//扫描组件
@Configuration
public class MainConfig {
    /**
     * 扩展原理：
     * BeanPostProcessor：bean后置处理器，bean创建对象初始化前后进行拦截工作的
     *
     * BeanFactoryPostProcessor：beanFactory的后置处理器；
     * 		在BeanFactory标准初始化之后调用，来定制和修改BeanFactory的内容；
     * 		所有的bean定义已经保存加载到beanFactory，但是bean的实例还未创建
     *
     *
     * BeanFactoryPostProcessor原理:
     * 1)、ioc容器创建对象
     * 2)、invokeBeanFactoryPostProcessors(beanFactory);
     * 		如何找到所有的BeanFactoryPostProcessor并执行他们的方法；
     * 			1）、直接在BeanFactory中找到所有类型是BeanFactoryPostProcessor的组件，并执行他们的方法
     * 			2）、在初始化创建其他组件前面执行
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
