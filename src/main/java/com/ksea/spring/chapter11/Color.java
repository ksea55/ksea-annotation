package com.ksea.spring.chapter11;

import org.springframework.beans.factory.annotation.Value;

public class Color {

    @Value("${color.red}")  //获取配置文件中的值进行赋值
    private String name;

    public Color() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
