package com.nautilus2;

import java.util.ArrayList;

public class MySweetProgram {
	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add(1, "BMW");
		System.out.println(cars);
		System.out.println(cars.get(2));
		System.out.println(cars.set(1, "Toyota"));
		System.out.println(cars);
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("The car is: " + cars.get(i));
		}
		System.out.println("\n");
		for (String i : cars) {
			System.out.println("Another way to loop through cars is: " + i);
		}
	}
}
