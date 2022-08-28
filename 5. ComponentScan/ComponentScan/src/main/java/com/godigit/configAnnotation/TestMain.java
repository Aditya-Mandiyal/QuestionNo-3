package com.godigit.configAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
	Truck truck1=(Truck)context.getBean("truck");
	truck1.working();
	
}
}
