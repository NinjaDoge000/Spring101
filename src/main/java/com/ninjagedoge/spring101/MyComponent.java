package com.ninjagedoge.spring101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Autowired
    public MyComponent2 myComponent2;

    public void sayHello() {
        System.out.println("hello from MyComponent class");
        myComponent2.doWork();
    }
}
