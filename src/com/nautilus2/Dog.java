package com.nautilus2;

public class Dog {
	public String random = "Random public string";
	private String name;
	private int age;
	
	// no-arg constructor
	public Dog() {
		this.name = "Bob";
		this.age = 3;
	}
	
	// parameterized constructor
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	private void kill() {
		System.out.println("Dog kill...");
	}
}
