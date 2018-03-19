package com.ksea.spring.chapter10.lifeCycle4;

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
         * 执行 postProcessBeforeInitialization 了 其中beanName:org.springframework.context.event.internalEventListenerProcessor,创建的Object：org.springframework.context.event.EventListenerMethodProcessor@62e136d3
         执行 postProcessAfterInitialization 了 其中beanName:org.springframework.context.event.internalEventListenerProcessor,创建的Object：org.springframework.context.event.EventListenerMethodProcessor@62e136d3
         执行 postProcessBeforeInitialization 了 其中beanName:org.springframework.context.event.internalEventListenerFactory,创建的Object：org.springframework.context.event.DefaultEventListenerFactory@6279cee3
         执行 postProcessAfterInitialization 了 其中beanName:org.springframework.context.event.internalEventListenerFactory,创建的Object：org.springframework.context.event.DefaultEventListenerFactory@6279cee3
         执行 postProcessBeforeInitialization 了 其中beanName:mainConfig,创建的Object：com.ksea.spring.chapter10.lifeCycle4.MainConfig$$EnhancerBySpringCGLIB$$1756c8bc@4206a205
         执行 postProcessAfterInitialization 了 其中beanName:mainConfig,创建的Object：com.ksea.spring.chapter10.lifeCycle4.MainConfig$$EnhancerBySpringCGLIB$$1756c8bc@4206a205
         对象创建完成...........
         执行 postProcessBeforeInitialization 了 其中beanName:student,创建的Object：com.ksea.spring.chapter10.lifeCycle4.Student@7bb58ca3
         正在执行 InitializingBean接口中的 afterPropertiesSet方法进行对象的初始化.
         执行 postProcessAfterInitialization 了 其中beanName:student,创建的Object：com.ksea.spring.chapter10.lifeCycle4.Student@7bb58ca3
         IOC创建完成.............
         正在执行 DisposableBean接口中的 destory销毁方法，销毁对象.
         IOC 容器关闭....

         *
         *
         */
    }
}
