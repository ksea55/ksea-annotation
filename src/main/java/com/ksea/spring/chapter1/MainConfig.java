package com.ksea.spring.chapter1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//通过注解的方式来进行ioc配置,此处的@Configuration就相当于beans.xml

@Configuration
public class MainConfig {


    /**
     * 此处的@bean 注明是通过 注入相当于 beans.xml中德
     * <bean id="person" class="com.ksea.spring.chapter1.Person">
     * <property name="name" value="张三"/>
     * <property name="age" value="21"/>
     * </bean>
     * <p>
     * 其中这里的id就是其方法名 person
     *
     * @return
     */
    @Bean
    public Person person() {
        return new Person("jacky", 44);
    }


    @Bean
    public Person person_01() {
        return new Person("jacky_01", 44);
    }


    //通过注解指定其id，优先使用 如果没有设置，就使用方法名
    @Bean(value = "myPerson")
    public Person person_02() {
        return new Person("jacky", 44);
    }


}
