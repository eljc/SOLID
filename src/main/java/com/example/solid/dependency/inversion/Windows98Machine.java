package com.example.solid.dependency.inversion;

public class Windows98Machine {

	private final StandardKeyboard keyboard;
	private final Monitor monitor;

	// By declaring the StandardKeyboard and Monitor with the new keyword, 
	// we've tightly coupled these three classes together.
	
	public Windows98Machine() {

		monitor = new Monitor();
		keyboard = new StandardKeyboard();

	}
}
