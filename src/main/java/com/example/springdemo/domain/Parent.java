package com.example.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


public class Parent {


    @Autowired
    private List<Child> dziecko1;

    public String getChild() {
        return "dupa";
    }

    private String firstName;
    private String yob;

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
