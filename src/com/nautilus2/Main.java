package com.nautilus2;

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
			
			// accessing the variable model of the outer class
			if (MotherBoard.this.model.equals("MSI")) {
				return 4;
			} else {
				return usb2 + usb3;	
			}
		}	
	}
}

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello Nested and Inner Classes");
		
		// create object of Outer class CPU
		CPU cpu = new CPU();
		
		// create an object of inner class Processor using outer class
		CPU.Processor processor = cpu.new Processor();
		
		// create an object of inner class Processor RAM using outer class CPU
		CPU.RAM ram = cpu.new RAM();
		System.out.println("Processor Cache = " + processor.getCache());
		System.out.println("Ram Clock speed = " + ram.getClockSpeed());
		
		// create an object of the outer class Car
		Car car1 = new Car("Crysler", "4WD");
		
		// create an object of inner class using the outer class
		Car.Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println(engine.getEngineType());
		MotherBoard motherboard = new MotherBoard("Random Model");
		
		// object creation of the outer Animal class
		Animal animal = new Animal();
		
		// object creation of the non-static class
		Animal.Reptile reptile = animal.new Reptile();
		
		Animal.Mammal mammal = new Animal.Mammal();
		mammal.displayInfo();
		reptile.displayInfo();
		
		
	}
}
