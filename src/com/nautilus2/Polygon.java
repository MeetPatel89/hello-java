package com.nautilus2;

public class Polygon {
	public void display() {
		System.out.println("Inside the Polygon class");
	}
}

class AnonymousDemo {
	public void createClass() {
		
		// creation of anonymous class extending class Polygon
		Polygon p1 = new Polygon() {
			public void display() {
				System.out.println("Inside an anonymous class.");
			}
		};
		p1.display();
	}
}

class Print {
	public static void main(String[] args) {
		System.out.println("Hello Polygon");
		
	}
}
