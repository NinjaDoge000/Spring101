package com.ninjagedoge.spring101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PrimaryQualifier {

    /*
    <!-- Field Injection -->
    @Autowired
    @Qualifier("BeanB")
    public Service service;
     */
    public final Service service;
    public  Service servicePrimary;

    PrimaryQualifier(@Qualifier("BeanB") Service service) {
        this.service = service;
        System.out.println("Hi From MyQualifier! " + this.service);
    }

    @Autowired
    public void setServicePrimary(Service servicePrimary) {
        System.out.println("Hi From setServicePrimary! " + servicePrimary);
        this.servicePrimary = servicePrimary;
    }
}

interface Service {}

@Component("BeanA")
@Primary
class ServiceImpl1 implements Service {

    ServiceImpl1() {
        System.out.println("Hi From ServiceImpl1 (Primary)! " + this);
    }
}

@Component("BeanB")
class ServiceImpl2 implements Service {

    ServiceImpl2() {
        System.out.println("Hi From ServiceImpl2! " + this);
    }
}

