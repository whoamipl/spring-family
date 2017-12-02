package com.example.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Child {


    @Autowired
    @Qualifier("mama")
    Parent mom;
    
    @Autowired
    @Qualifier("tata")
    Parent dad;

    public Parent getMom() {
        return mom;
    }

    public void setMom(Parent mom) {
        this.mom = mom;
    }

    public String getFirstName() {
        return "child";
    }



    private String firstName;
    private int yob;
}
