package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
         Employee emp1=(Employee)context.getBean("emp1");
         System.out.println(emp1);
         }

}
