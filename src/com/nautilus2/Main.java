package com.nautilus2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;


class Car {
	String carName;
	String carType;
	
	// assign values using constructor
	public Car(String name, String type) {
		this.carName = name;
		this.carType = type;
	}
	
	// private method
	private String getCarName() {
		return this.carName;
	}
	
	// inner class
	class Engine {
		String engineType;
		void setEngine() {
			
			// Accessing the carType property of Car
			if (Car.this.carType.equals("4WD")) {
				
				// Invoking method getCarName() of Car
				if (Car.this.getCarName().equals("Crysler")) {
					this.engineType = "Smaller";
				} else {
					this.engineType = "Bigger";
				}
			} else {
				this.engineType = "Bigger";
			}
		}
		
		String getEngineType() {
			return this.engineType;
		}	
	}
}

class MotherBoard {
	String model;
	public MotherBoard(String model) {
		this.model = model;
	}
	
	// static nested class
	static class USB {
		int usb2 = 2;
		int usb3 = 1;
		int getTotalPorts() {
			
			return usb2 + usb3;
		}	
	}
}

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello Nested and Inner Classes");
		
		Dog dog = new Dog("Rocky", 4);	
		Class dogClass = dog.getClass();
		
		System.out.println("Class Name: " + dogClass.getName());
		
		System.out.println("Interface? " + dogClass.isInterface());
		
		System.out.println("Array? " + dogClass.isArray());
		
		System.out.println("\nConstructors: ");
		Constructor[] constructors = dogClass.getConstructors(); 	
		for (Constructor constructor: constructors) {
			System.out.println("constructor name: " + constructor.getName());
			System.out.println("---params---");
			if (constructor.getParameterCount() == 0) {
				System.out.println("no-arg constructor");
			} else {
				Parameter[] parameters = constructor.getParameters();
				for (Parameter parameter: parameters) {
					System.out.println(parameter.getName() + ": " + parameter.getType());
				}
			}
		}	
		
		// display all public methods
		System.out.println("Methods");
		Method[] methods = dogClass.getMethods();
		int i = 1;
		for (Method method: methods) {
			
			System.out.println("Method #" + i + " " + Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName() + " - " + Arrays.toString(method.getParameters()));
			i++;
		}
		
		System.out.println("\n");
		
		// display all methods except inherited methods regardless of their access modifiers
		System.out.println("Declared Methods");
		Method[] declaredMethods = dogClass.getDeclaredMethods();
		int j = 1;
		for (Method method: declaredMethods) {
			
			System.out.println("Method #" + j + " " + Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName() + " - " + Arrays.toString(method.getParameters()));
			j++;
		}
		
		// print the fields
		System.out.println("\n");
		System.out.println("Fields");
		Field[] fields = dogClass.getFields();
		int k = 1;
		for (Field field: fields) {
			System.out.println("Fields #" + k + " " + Modifier.toString(field.getModifiers()) + " " + field.getType() + " " + field.getName());
			k++;
		}
	}
}
