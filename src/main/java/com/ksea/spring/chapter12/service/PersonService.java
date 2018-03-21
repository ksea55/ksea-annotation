package com.ksea.spring.chapter12.service;

import com.ksea.spring.chapter12.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private StudentDao studentDao;


    @Autowired
    public PersonService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "studentDao=" + studentDao +
                '}';
    }
}
