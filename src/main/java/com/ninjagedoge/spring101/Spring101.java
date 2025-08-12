package com.ninjagedoge.spring101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring101 {
    public static void main(String args[]) {
        ApplicationContext context = SpringApplication.run(Spring101.class, args);

        MyComponent myComponent = context.getBean(MyComponent.class);
        myComponent.sayHello();

        // Lazy bean instantiation example
        Consumer consumer = context.getBean(Consumer.class);

        System.out.println("Calling consumer.doWork()...");
        consumer.doWork();

    }
}