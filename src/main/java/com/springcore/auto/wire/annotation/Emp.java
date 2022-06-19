package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired	
	@Qualifier("address2")
	private Address address;{System.out.println("inside property");}
	

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	public Address getAddress() {		
		return address;
		
	}

	
	  @Autowired  
	  @Qualifier("address2")
	 
	public void setAddress(Address address) {
		System.out.println("inside setter");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired	
	public Emp(@Qualifier("address2")Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}
	
	

}