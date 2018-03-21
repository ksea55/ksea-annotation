package com.ksea.spring.chapter12.service;

import com.ksea.spring.chapter12.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    //@Qualifier("studentDao")
    @Autowired(required = false)
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    @Override
    public String toString() {
        return "StudentService{" +
                "studentDao=" + studentDao +
                '}';
    }
}
