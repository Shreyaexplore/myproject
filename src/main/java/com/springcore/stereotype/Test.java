package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		 Student stud=context.getBean("ob", Student.class);
		 Student stud1=context.getBean("ob", Student.class);
			
			  System.out.println(stud); System.out.println(stud.getAddress());
			  System.out.println(stud.getFeestructure());
			  System.out.println(stud.getProperties());
			 
		 System.out.println(stud.hashCode());
		 System.out.println(stud1.hashCode());
		 
		 Teacher teach=context.getBean("teacher", Teacher.class);
		 System.out.println(teach.hashCode());
		 
		 Teacher teaches=context.getBean("teacher", Teacher.class);
		 System.out.println(teaches.hashCode());

	}

}
