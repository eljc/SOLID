package com.example.solid;

import com.example.solid.exception.ValidationException;
import com.example.solid.model.Categories;
import com.example.solid.model.Employee;

public class ChangeCategoryService {

	public void change(Employee employee, boolean updateSalary) {
		Categories currentCategory = employee.getCategory();
		if(Categories.FULL_STACK_PROGRAMMING == currentCategory) {
			throw new ValidationException("This category dont change");			
		}
		
		if(updateSalary) {
			Categories newCategory = currentCategory.getNext();
			employee.changeCategory(newCategory);
		}else {
			throw new ValidationException("The employee didn't hit the goal");
		}
	}
}
