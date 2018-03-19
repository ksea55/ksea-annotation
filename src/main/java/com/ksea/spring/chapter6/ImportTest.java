package com.ksea.spring.chapter6;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    @Test
    public  void  test(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);
        StudentService studentService = applicationContext.getBean(StudentService.class);
        studentService.addStudent();

    }
}
