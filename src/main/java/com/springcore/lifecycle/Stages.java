package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Stages {
	private String stage;

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public Stages() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Stages [stage=" + stage + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("inside init method initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroyed in seconds");
	}

}
