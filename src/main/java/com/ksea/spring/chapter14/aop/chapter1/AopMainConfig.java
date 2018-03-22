package com.ksea.spring.chapter14.aop.chapter1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy//开启AOP切面自动代理，这一步很关键,相当于在xml中的<aop:aspectj-autoproxy/>配置
@Configuration
public class AopMainConfig {


    //将业务类与切面类注册到容器中
    @Bean(value = "mathCalculation")
    public MathCalculation mathCalculation() {
        return new MathCalculation();
    }


    @Bean(value = "logAspects")
    public LogAspects logAspects() {
        return new LogAspects();
    }

}
