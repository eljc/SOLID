package com.example.solid.model;

import java.time.LocalDate;

public class Employee {
	
	private PersonalData personalData;
	private LocalDate lastSalary;
	
	public Employee(PersonalData personalData, LocalDate lastSalary, Categories category) {
		this.personalData = personalData;
		this.lastSalary = lastSalary;
	}
	
	public Categories getCategory() {
		return personalData.getCategories();
	}
	
	public void changeCategory(Categories newCategory) {
		this.personalData.setCategories(newCategory);
	}
	
	
	public PersonalData getPersonalData() {
		return personalData;
	}
	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
	public LocalDate getLastSalary() {
		return lastSalary;
	}
	public void setLastSalary(LocalDate lastSalary) {
		this.lastSalary = lastSalary;
	}
	
	
	

}
