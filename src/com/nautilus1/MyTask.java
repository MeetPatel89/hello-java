package com.nautilus1;

public class MyTask extends Thread {
	
	@Override
	public void run() {
		for (int doc = 1; doc <= 10; doc++) {
			System.out.println("@@ Printing Document #" + doc + " - Printer2");
		}
	}
	
}

class App {
	
	public static void main(String[] args) {
		System.out.println("Hello App!");
		System.out.println("==Application Started==");
		
		MyTask task = new MyTask();
		task.start();
		
		for (int doc = 1; doc <= 10; doc++) {
			System.out.println("^^ Printing Document #" + doc + " - Printer1");
		}
		
		System.out.println("==Application Ended==");
	}
}