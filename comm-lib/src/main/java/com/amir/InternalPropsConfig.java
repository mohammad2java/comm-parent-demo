package com.amir;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import jakarta.annotation.PostConstruct;

@Configuration
@PropertySource(value = "classpath:other-${spring.profiles.active:local}.properties")
public class InternalPropsConfig {
	
	
	@PostConstruct
	public void init() {
		
		FileCopier.copyFileFromClasspath("other-local.properties", System.getProperty("user.dir")+"/output.properties");
		System.out.println("Initialized !");
	}

}
