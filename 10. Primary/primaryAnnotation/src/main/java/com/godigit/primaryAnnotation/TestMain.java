package com.godigit.primaryAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	  Thar thar1=context.getBean(Thar.class);
	  thar1.mode();
	}

}
