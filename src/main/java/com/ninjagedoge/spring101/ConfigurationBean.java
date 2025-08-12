package com.ninjagedoge.spring101;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {

    @Bean("MyCustomBeanNameElseItsTheMethodName")
    public MyBean createBean() {
        return new MyBean();
    }
}

class MyBean {

    public MyBean() {
        System.out.println("My Bean created!");
    }
}
