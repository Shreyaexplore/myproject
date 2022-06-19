package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Subprocess implements InitializingBean,DisposableBean{
	private double steps;

	public double getSteps() {
		return steps;
	}

	public void setSteps(double steps) {
		this.steps = steps;
	}

	public Subprocess() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Subprocess [steps=" + steps + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in init method");
	}
	

}
