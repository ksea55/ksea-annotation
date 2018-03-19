package com.ksea.spring.chapter10.lifeCycle1;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycletTest {

    @Test
    public void singleton() {
        //容器创建
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("spring IOC容器创建完成.");
        //关闭容器
        applicationContext.close();

        /**
         * 运行结果:
         *
         *
         *
         三月 19, 2018 10:06:30 下午 org.springframework.context.annotation.AnnotationConfigApplicationContext prepareRefresh
         信息: Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5f8ed237: startup date [Mon Mar 19 22:06:30 CST 2018]; root of context hierarchy
         student  正在执行无参构造并创建完成....................
         student..............初始化完成.

         spring IOC容器创建完成.
         student...............正在执行销毁.
         三月 19, 2018 10:06:31 下午 org.springframework.context.annotation.AnnotationConfigApplicationContext doClose
         信息: Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5f8ed237: startup date [Mon Mar 19 22:06:30 CST 2018]; root of context hierarchy


         总结: 在作用域是singleton的时候，bean的生命周期，首先跟随IOC容器的创建，对象就开始创建，当对象创建完成之后，就开始调用init方法，当对象创建完之后，对象将交给容器进行管理，当容器关闭的时候，对象就执行销毁

         *
         */

    }


    @Test
    public void prototype() {
        //容器创建
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("spring IOC容器创建完成.");
        Object stu = applicationContext.getBean("stu");
        System.out.println("bean调用完成....");
        //关闭容器
        applicationContext.close();

        /**
         * 执行结果:
         *

         spring IOC容器创建完成.
         执行prototype多实例作用域...
         student  正在执行无参构造并创建完成....................
         student..............初始化完成.
         bean调用完成....
         *
         *
         * 总结：当作用域是prototype的时候，当IOC容器创建的时候，bean不会创建，而是在调用的时候才会进行创建,applicationContext.getBean("stu");，接着开始进行对象的创建，然后执行其初始化方法，多实例作用域的bean
         * 不会交给IOC容器管理，只是创建，因此容器关闭的时候bean的销毁并没有执行
         */

    }
}
