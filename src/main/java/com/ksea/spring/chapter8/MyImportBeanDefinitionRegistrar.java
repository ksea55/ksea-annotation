package com.ksea.spring.chapter8;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        //查看在容器中是否包含 为red的bean
        boolean red = registry.containsBeanDefinition("red");
        boolean blue = registry.containsBeanDefinition("blue");

        if (red && blue) {

            //这里可以设置bean的所有信息，包括作用域之类的
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();

            rootBeanDefinition.setBeanClass(Color.class);

            // 注册的bean名
            registry.registerBeanDefinition("color", rootBeanDefinition);
        }

    }
}
