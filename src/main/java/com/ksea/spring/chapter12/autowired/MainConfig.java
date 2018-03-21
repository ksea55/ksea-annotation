package com.ksea.spring.chapter12.autowired;

import com.ksea.spring.chapter12.dao.StudentDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//扫描组件
@ComponentScan(value = {"com.ksea.spring.chapter12.dao", "com.ksea.spring.chapter12.service"})
@Configuration
public class MainConfig {


    @Bean(value = "studentDao2")
    public StudentDao studentDao() {

        StudentDao studentDao = new StudentDao();
        studentDao.setDesc("2");

        return studentDao;
    }



}
