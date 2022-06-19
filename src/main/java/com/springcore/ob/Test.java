package com.springcore.ob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ob/obconfig.xml");
		 A temp=(A) context.getBean("aref");
		 System.out.println(temp.getId());
		 System.out.println(temp.getOb().getY());
		 System.out.println(temp);

	}

}
