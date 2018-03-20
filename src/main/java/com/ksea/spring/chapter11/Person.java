package com.ksea.spring.chapter11;

import org.springframework.beans.factory.annotation.Value;

public class Person {


    @Value("mexican") //基于基本数据
    private String name;
    @Value("#{21-2}") //spring的 SPEL表达式,另外还能通过${}来获取在环境中的值
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
