package com.nautilus2;

enum Size {
	SMALL,
	MEDIUM,
	LARGE,
	EXTRALARGE;
	
	public String getSize() {
		
		// this will refer to the instantiated object
		switch(this) {
		case SMALL:
			return "small";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extralarge";
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		// call getSize()
		// after instantiating an enum object (constant)
		System.out.println("The size of the pizza is " + Size.SMALL.getSize());
		System.out.println(Size.SMALL.compareTo(LARGE));
		Size[] enumArray = Size.values();
		System.out.println(enumArray[4]);
	}
}
