package com.ksea.spring.chapter16;

public class Person {

    private String name;

    public Person() {
        System.out.println("开始执行Person的无参构造函数..............");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
