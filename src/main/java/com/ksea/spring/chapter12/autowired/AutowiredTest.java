package com.ksea.spring.chapter12.autowired;

import com.ksea.spring.chapter12.dao.StudentDao;
import com.ksea.spring.chapter12.service.PersonService;
import com.ksea.spring.chapter12.service.StudentService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {

    @Test
    public void test() {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        StudentService studentService = applicationContext.getBean(StudentService.class);
        System.out.println(studentService);

        Object studentDao = applicationContext.getBean("studentDao");
        System.out.println(studentDao);


        PersonService personService = applicationContext.getBean(PersonService.class);
        System.out.println(personService);

    }
}
