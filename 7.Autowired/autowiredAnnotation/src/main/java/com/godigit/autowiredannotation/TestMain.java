package com.godigit.autowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	   College c1=(College)context.getBean("college");	
       System.out.println(c1);
	}

}
