package com.example.solid.open.close;

import com.example.solid.exception.InvalidParameterException;

public class Calculator {

	public void calculate(CalculatorOperation operation) {
		if (operation == null) {
			throw new InvalidParameterException("Can not perform operation");
		}

		operation.perform();
	}

}
