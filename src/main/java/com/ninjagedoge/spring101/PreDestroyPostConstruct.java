package com.ninjagedoge.spring101;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PreDestroyPostConstruct {

    public PreDestroyPostConstruct() {
        System.out.println("PreDestroyPostConstruct constructor...");
    }
    @PostConstruct
    void init() {
        System.out.println("PreDestroyPostConstruct PostConstruct...");
    }

    @PreDestroy
    void cleanup() {
        System.out.println("PreDestroyPostConstruct PreDestroy...");
    }
}
