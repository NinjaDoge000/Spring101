package com.ninjagedoge.spring101;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BeanScope {
}


@Component
class SingletonBean {

    /*
        Creates two different object
        com.ninjagedoge.spring101.PrototypeBean@1b822fcc
        com.ninjagedoge.spring101.PrototypeBean@532721fd
     */

    @Autowired
    public PrototypeBean prototypeBean1;

    @Autowired
    public PrototypeBean prototypeBean2;
}

@Component
@Scope("prototype")
class PrototypeBean {

    public PrototypeBean() {
        System.out.println(this);
    }
}