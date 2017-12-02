package com.example.springdemo.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/beans.xml" })
public class PersonManagerTest {

	@Autowired
	private PersonManager pm;

	@Test
	public void sayHelloTest() {
		assertEquals("I'm Zosia!", pm.checkChild());
	}

	@Test
	public void testInjection() {

	}
	@Test
	public void justShowParentsNameAndChilds ()
	{
		pm.checkParentsName();
		System.out.println(pm.mama.getChild());
		System.out.println(pm.tata.getChild());
	}

}
