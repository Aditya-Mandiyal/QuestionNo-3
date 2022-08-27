package com.godigit.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     Student s1=(Student)context.getBean("student");
     System.out.println(s1);
	}

}
