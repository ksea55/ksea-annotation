package com.ksea.spring.chapter9;

import org.springframework.beans.factory.FactoryBean;

/**
 * 定义学生工厂，实现其FactoryBean
 */
public class StudentFactoryBean implements FactoryBean<Student> {


    /**
     * 通过getObject 得到我们的学生bean
     *
     * @return
     * @throws Exception
     */

    @Override
    public Student getObject() throws Exception {

        System.out.println("StudentFactoryBean....正在通过getObject方法创建....学生信息");

        return new Student();
    }

    /**
     * 返回工厂创建的类型
     *
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    /**
     * 作用域 是否是单例作用域
     * false:多实例作用域 也就是prototype，没调用一次创建一次
     * true:单例作用域 也就是singleton,只创建一份
     *
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
