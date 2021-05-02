package com.nautilus1;


// Java program to demonstrate how exception is thrown
// how the runtime system searches the call stack
public class ExceptionThrown {
	
	// It throws the Exception(Arithmetic Exception)
	// Appropriate Exception handler is not found within this method.
	static int divideByZero(int a, int b) {
		
		// this statement will cause ArithmeticException (/ by zero)
		int i = a / b;
		
		return i;		
	}
	
	// The runtime system searches the appropriate Exception handler
	// in this method also but couldn't find it. So continuing with the call stack
	static int computeDivision(int a, int b) {
		int res = 0;
		
		try {
			res = divideByZero(a, b);
		}
		// doesn't match with ArithmeticException
		catch (NumberFormatException ex) {
			System.out.println("NumberFormatException has occured");
		}
		return res;	
	}
	
	// In this method found appropriate Exception handler
	// i.e. matching catch block
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try {
			int i = computeDivision(a, b);
			System.out.println(i);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}	
			
	}
}
