package com.springcore.lifecycle;

public class Process {
	private double speed;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Process() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Process [speed=" + speed + "]";
	}

	
	  public void init() 
	  { System.out.println("Inside init method"); } 
	  public void destroy() 
	  { System.out.println("Inside destroy method"); }
	  
	 
}
