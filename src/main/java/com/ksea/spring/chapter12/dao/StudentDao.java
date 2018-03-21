package com.ksea.spring.chapter12.dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    private String desc = "1";

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "StudentDao{" +
                "desc='" + desc + '\'' +
                '}';
    }
}
