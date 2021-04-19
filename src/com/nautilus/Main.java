package com.nautilus;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello nautilus package");
		
		// create an object of the outer class
		Car car = new Car("Toyota", "Corolla");
		Car carOne = new Car("Hummer", "H3");
		
		// create an object of inner class using the outer class
		Car.Engine engine = carOne.new Engine();
		engine.setEngine();
		System.out.println(engine.getEngineType());
	}
}
