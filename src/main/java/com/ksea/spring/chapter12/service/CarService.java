package com.ksea.spring.chapter12.service;

import com.ksea.spring.chapter12.dao.CarDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class CarService {


    @Resource
    private CarDao carDao;


    @Override
    public String toString() {
        return "CarService{" +
                "carDao=" + carDao +
                '}';
    }
}
