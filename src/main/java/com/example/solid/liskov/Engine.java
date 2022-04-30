package com.example.solid.liskov;

public class Engine {

	public void on() {
		System.out.print("On");
	}
	
	public void powerOn(int amount){
		System.out.print(amount);
	}
}
