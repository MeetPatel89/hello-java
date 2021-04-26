package com.nautilus1;

public class Area {
	
	// fields to calculate area
	private int length;
	private int breadth;
	private int area;
	
	// constructor to initialize values
	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	// method to calculate area 
	public int getArea() {
		area = length * breadth;
		return area;
	}
	
}
