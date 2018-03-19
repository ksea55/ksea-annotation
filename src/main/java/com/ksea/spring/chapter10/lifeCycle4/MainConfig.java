package com.ksea.spring.chapter10.lifeCycle4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(value = "com.ksea.spring.chapter10.lifeCycle4")//通过包扫描的方式进行组件的注入
@Configuration
public class MainConfig {
}
