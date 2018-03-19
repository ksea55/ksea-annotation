package com.ksea.spring.chapter10.lifeCycle1;

public class Student {


    public Student() {
        System.out.println("student  正在执行无参构造并创建完成....................");
    }

    public void init() {
        System.out.println(" student..............初始化完成.");
    }


    public void detory() {
        System.out.println("student...............正在执行销毁.");
    }
}
