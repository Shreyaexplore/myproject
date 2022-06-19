package com.springcore.stereotype;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Shreya Suman")
	private String studentName;
	@Value("Dhanbad")
	private String city;
	
	@Value("#{list}")
	private List<String> address;
	
	@Value("#{has}")
	private Map<String,Integer> feestructure;
	
	@Value("#{props}")
	private Properties properties;

	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}
	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}

}
