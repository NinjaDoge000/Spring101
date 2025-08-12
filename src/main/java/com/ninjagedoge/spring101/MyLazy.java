package com.ninjagedoge.spring101;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Lazy
class ExpensiveService {
    public ExpensiveService() {
        System.out.println("ExpensiveService created!");
    }

    public void serve() {
        System.out.println("Serving...");
    }
}

@Component
class Consumer {

    private final ExpensiveService expensiveService;

    @Autowired
    public Consumer(@Lazy ExpensiveService expensiveService) {
        System.out.println("Consumer constructor called.");
        this.expensiveService = expensiveService;
    }

    public void doWork() {
        System.out.println("Consumer.doWork() called.");
        expensiveService.serve();
    }
}


