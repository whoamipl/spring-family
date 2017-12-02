package com.example.springdemo.service;


import com.example.springdemo.domain.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.domain.Person;

@Component
public class PersonManager {

	@Autowired
	Parent mama;

	@Autowired
	Parent tata;

	public String checkChild() {
		return "I'm " + "!";
	}

	public void checkParentsName() {
		System.out.println("Mama: "+mama.getFirstName() + "Tata: "+ tata.getFirstName());
	}

}
