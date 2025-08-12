package com.ninjagedoge.spring101;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class MyValue {

    public final MyComponent myComponent;
    public final String var;

    @Value("note no final because set after construtor instantiation")
    public String var2;


    public MyValue(MyComponent myComponent, @Value("${app.name}") String var) {
        this.myComponent = myComponent;
        this.var = var;
        System.out.println("Value is " + this.var);
        System.out.println("Before PostConstruct-value is " + this.var2);
    }


    @PostConstruct
    void init() {
        System.out.println("After PostConstruct-value is " + this.var2);
    }

    /*
    Output:
    Value is Spring101
    Before PostConstruct-value is null
    After PostConstruct-value is note no final because set after constructor instantiation
     */
}
