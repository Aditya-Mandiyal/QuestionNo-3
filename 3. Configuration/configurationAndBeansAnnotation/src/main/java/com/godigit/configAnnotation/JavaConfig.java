package com.godigit.configAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
@Bean
	public Truck getTruck() {
		return new Truck();
	}
}
