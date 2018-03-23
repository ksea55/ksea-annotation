package com.ksea.spring.chapter15;

import com.ksea.spring.chapter15.model.Student;
import com.ksea.spring.chapter15.service.StudentService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TransactionManagementMainConfig.class);
        StudentService studentService = applicationContext.getBean(StudentService.class);
        studentService.add(new Student("jacky11", 32));
    }
}
