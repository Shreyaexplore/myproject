package com.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context= new AnnotationConfigApplicationContext(NewConfig.class);
     Student stud =context.getBean("temp", Student.class);
     System.out.println(stud);
     stud.study();
    
	}

}
