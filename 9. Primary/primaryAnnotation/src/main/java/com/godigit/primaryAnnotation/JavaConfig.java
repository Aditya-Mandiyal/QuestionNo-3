package com.godigit.primaryAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

	  @Bean
	   @Primary
	   public Thar getManualThar() {
	      return new ManualMode();
	   }

	   @Bean
	   public Thar getAutomaticThar() {
	      return new AutomaticMode();
	   }
}
