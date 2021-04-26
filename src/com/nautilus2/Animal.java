package com.nautilus2;

public class Animal {
	
	// inner non-static class
	class Reptile {
		public void displayInfo() {
			System.out.println("I am a reptile.");
			Animal.this.eat();
		}
	}
	
	// static class 
	static class Mammal {
		public void displayInfo() {
			System.out.println("I am a mammal.");
		}
	}
	
	public void eat() {
		System.out.println("I eat food");
	}
}
