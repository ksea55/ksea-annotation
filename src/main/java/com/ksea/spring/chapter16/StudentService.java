package com.ksea.spring.chapter16;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //通过注解的方式进行监听
    @EventListener(value = {ApplicationEvent.class})
    public void listener(ApplicationEvent event) {
        System.out.println("在StudentService...中监听到的事件:" + event);

    }
}
