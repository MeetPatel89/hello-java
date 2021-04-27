package com.nautilus2;

public class Singleton {
	
	// static variable singletonObj of type Singleton
	private static Singleton singletonObj;
	
	// variable of type String
	public String s;
	
	//private constructor restricted to this class itself
	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}
	
	// static method to create instance of Singleton class
	public static Singleton getInstance() {
		if (singletonObj == null) {
			singletonObj = new Singleton();
		}
		return singletonObj;
	}
}	

class Random {
	public static String m;
	
	public String n;
	
	public Random() {
		m = "static string from Random class";
		n = "non static string from Random class";
	}
	
	public static void randomMethod() {
		System.out.println("Random string from static method in random class");
	}
}

class Main2 {
	public static void main(String[] args) {
		System.out.println("Hello Singleton!");
		Random random = new Random();
		System.out.println(Random.m);
		Random.randomMethod();
		random.randomMethod();
		System.out.println(random.m);
		
	}	
}
