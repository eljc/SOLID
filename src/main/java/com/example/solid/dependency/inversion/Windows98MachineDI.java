package com.example.solid.dependency.inversion;

public class Windows98MachineDI {
	
	private final Keyboard keyboard;
	private final Monitor monitor;

	//Now our classes are decoupled and communicate through the Keyboard abstraction.
	public Windows98MachineDI(Keyboard keyboard, Monitor monitor) {
		
		this.keyboard = keyboard;
		this.monitor = monitor;
	}

}
