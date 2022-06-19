package com.springcore.construct;

import java.util.List;

public class Person {
 private String name;
 private String address;
 private Certi certi;
 private List<String> lis;
 
 public Person(String name, String address, Certi certi,List<String> lis) {
	super();
	this.name = name;
	this.address = address;
	this.certi = certi;
	this.lis=lis;
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name+":"+this.address+":"+this.certi.certno+":"+this.lis;
}
 
}
