package com.ksea.spring.chapter15.dao;

import com.ksea.spring.chapter15.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void save(Student student) {
        String sql = "INSERT INTO student(name,age) VALUES(?,?);";
        jdbcTemplate.update(sql, student.getName(), student.getAge());
    }

}
