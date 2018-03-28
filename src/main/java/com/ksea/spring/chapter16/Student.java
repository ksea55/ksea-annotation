package com.ksea.spring.chapter16;

public class Student {
    private String name;

    public Student() {
        System.out.println("执行  Student 无参构造函数.............. ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
