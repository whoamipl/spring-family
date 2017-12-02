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
    private String firstName;
    private String yob;

    public Parent getMom() {
        return mom;
    }

    public void setMom(Parent mom) {
        this.mom = mom;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public String getYob() {
        return yob;
    }
}
