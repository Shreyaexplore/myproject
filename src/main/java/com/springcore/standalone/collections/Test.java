package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
        Person pers=context.getBean("person", Person.class);
        System.out.println(pers);
        System.out.println("---------------------------------");
        System.out.println(pers.getFriends().getClass().getName());
        System.out.println(pers.getFriends());
        System.out.println("----------------------------------");
        System.out.println(pers.getFeestructure().getClass().getName());
        System.out.println(pers.getFeestructure());
        System.out.println("----------------------------------");
        System.out.println(pers.getProperties());
	}

}
