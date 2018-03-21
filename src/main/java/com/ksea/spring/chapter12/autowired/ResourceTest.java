package com.ksea.spring.chapter12.autowired;

import com.ksea.spring.chapter12.service.CarService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ResourceTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        CarService carService = applicationContext.getBean(CarService.class);
        System.out.println(carService);


    }
}
