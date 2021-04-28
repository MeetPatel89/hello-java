package com.nautilus2;

enum Size {
	
	// enum constants calling the enum constructors
	SMALL("The size is small."),
	MEDIUM("The size is medium."),
	LARGE("The size is large."),
	EXTRALARGE("The size is extra large.");
	
	private final String pizzaSize;
	
	// private enum constructor
	private Size(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	public String getSize() {
		
		
		/*
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
		*/
		
		return pizzaSize;
	}
	
}

class sizeMain {
	public static void main(String[] args) {
		Size size = Size.EXTRALARGE;
		System.out.println(size.getSize());
		Class c1 = int.class;
		System.out.println(c1.getName());
	}
}
