package com.nautilus2;

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
		
	}
}
