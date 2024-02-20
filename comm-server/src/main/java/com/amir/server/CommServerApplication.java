package com.amir.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.amir")
public class CommServerApplication implements CommandLineRunner{

	@Value("${mm.name}")
	private String name;
	
	public static void main(String[] args) {
		SpringApplication.run(CommServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Got from child: "+name);
		
	}

}