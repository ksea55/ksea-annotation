package com.ksea.spring.chapter10.lifeCycle4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 通过实现这两个接口进行初始化与销毁
 * InitializingBean -->initMethod
 * DisposableBean--->DetoryMethod
 */
@Component
public class Student implements InitializingBean, DisposableBean {

    public Student() {
        System.out.println("对象创建完成...........");
    }

    /**
     * Invoked by a BeanFactory on destruction of a singleton.
     *
     * @throws Exception in case of shutdown errors.
     *                   Exceptions will get logged but not rethrown to allow
     *                   other beans to release their resources too.
     *                   <p>
     *                   从源码的注视中可以看到是在单例作用域下
     */
    @Override
    public void destroy() throws Exception {

        System.out.println("正在执行 DisposableBean接口中的 destory销毁方法，销毁对象. ");
    }

    /**
     * 对象创建完成并设置其属性之后进行执行
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行 InitializingBean接口中的 afterPropertiesSet方法进行对象的初始化.");


    }
}
