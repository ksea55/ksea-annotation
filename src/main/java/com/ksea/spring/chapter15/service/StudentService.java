package com.ksea.spring.chapter15.service;

import com.ksea.spring.chapter15.dao.StudentDao;
import com.ksea.spring.chapter15.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    //在需要事务管理的方法上，添加事务注解
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void add(Student student) {
        this.studentDao.save(student);
        System.out.println("数据已添加...........");
        int result = 10 / 0; //抛出异常测试事务回滚
    }
}
