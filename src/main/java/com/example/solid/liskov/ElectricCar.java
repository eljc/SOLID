package com.example.solid.liskov;

public class ElectricCar implements Car{

	//This is a blatant violation of Liskov substitution 
	// and is a bit harder to fix than our previous two principles.
	public void turnOnEngine() {
	    throw new AssertionError("I don't have an engine!");
	  }

	  public void accelerate() {
	    //this acceleration is crazy!
	  }
}
