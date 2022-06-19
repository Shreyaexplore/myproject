package com.springcore.config;

import org.springframework.stereotype.Component;


public class Student {
	
	private Uniform uniform;
	
	public Uniform getUniform() {
		return uniform;
	}
	public void setUniform(Uniform uniform) {
		this.uniform = uniform;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Uniform uniform) {
		super();
		this.setUniform(uniform);
	}
	public void study() {
		this.uniform.display();
		System.out.println("student is studying");
	}

}
