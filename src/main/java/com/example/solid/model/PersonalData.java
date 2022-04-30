package com.example.solid.model;

import java.math.BigDecimal;

public class PersonalData {
	
	private String name;
	private Categories categories;
	private BigDecimal salary;
		
	public PersonalData(String name, Categories categories, BigDecimal salary) {
		super();
		this.name = name;
		this.categories = categories;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	

}
