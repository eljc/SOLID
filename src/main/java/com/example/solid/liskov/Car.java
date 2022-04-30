package com.example.solid.liskov;

public interface Car {
/*
 * if class A is a subtype of class B, we should be able to replace B with A without disrupting the behavior of our program
 */
	void turnOnEngine();

	void accelerate();

}
