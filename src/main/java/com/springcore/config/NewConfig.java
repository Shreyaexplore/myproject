package com.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.springcore.config")
public class NewConfig {
	@Bean(name = {"temp","student","studs"})
	public Student getStudent() {
		Student student=new Student(getUniform());
		return student;
	}

	@Bean
	public Uniform getUniform() {
		return new Uniform();
	}
}
