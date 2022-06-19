package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
		context.registerShutdownHook();
		
		
		  Process pro= (Process) context.getBean("pro"); 
		  System.out.println(pro);
		  
		  
		  Subprocess sub=(Subprocess)context.getBean("sub"); 
		  System.out.println(sub);
		 
	   
	   Stages stag=(Stages) context.getBean("stag");
	   System.out.println(stag);

	}

}
