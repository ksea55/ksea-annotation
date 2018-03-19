package com.ksea.spring.chapter5;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        ClassLoader classLoader = context.getClassLoader();
        Environment environment = context.getEnvironment();
        BeanDefinitionRegistry registry = context.getRegistry();
        ResourceLoader resourceLoader = context.getResourceLoader();

        String name = environment.getProperty("os.name");
        if (name.equals("Linux")) {
            return true;
        }


        return false;
    }
}
