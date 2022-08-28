package com.godigit.configAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
@Configuration
@ComponentScan(basePackages ="com.godigit.configAnnotation")
public class JavaConfig {
@Bean
	public Truck getTruck() {
		return new Truck();
	}
}
