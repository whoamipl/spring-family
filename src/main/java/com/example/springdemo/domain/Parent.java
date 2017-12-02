package com.example.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;


public class Parent {

    private Parent myMom;
    private Parent myDad;
    private Parent myMomInLaw;
    private Parent myDadInLaw;

    @Autowired
    private List<Child> list;

    public String getChild() {
        return list
                .stream()
                .map(childName -> childName.getFirstName() + " ")
                .reduce("Dzieci: ", (acc, name) -> acc + name);
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

    public void setMyMom(Parent myMom) {
        this.myMom = myMom;
    }

    public Parent getMyMom() {
        return myMom;
    }

    public void setMyDad(Parent myDad) {
        this.myDad = myDad;
    }

    public Parent getMyDad() {
        return myDad;
    }

    public void setMyMomInLaw(Parent myMomInLaw) {
        this.myMomInLaw = myMomInLaw;
    }

    public Parent getMyMomInLaw() {
        return myMomInLaw;
    }

    public void setMyDadInLaw(Parent myDadInLaw) {
        this.myDadInLaw = myDadInLaw;
    }

    public Parent getMyDadInLaw() {
        return myDadInLaw;
    }


}
