package com.example.solid.liskov;

public class MotorCar implements Car {

	private Engine engine;

	@Override
	public void turnOnEngine() {
		engine.on();
	}

	@Override
	public void accelerate() {
		engine.powerOn(100);
	}

}
