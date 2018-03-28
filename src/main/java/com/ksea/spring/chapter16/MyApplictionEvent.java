package com.ksea.spring.chapter16;

import org.springframework.context.ApplicationEvent;

public class MyApplictionEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyApplictionEvent(Object source) {
        super(source);
        System.out.println("执行自定义监听");
    }
}
