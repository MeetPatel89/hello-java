package com.nautilus1;

public class ThreadDemo2 implements Runnable {
	public static void main(String[] args) {
		ThreadDemo2 obj = new ThreadDemo2();
		
		// pass ThreadDemo instance to a Thread object's constructor
		Thread thread = new Thread(obj);
		
		// thread starts here
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	
	public void run() {
		System.out.println("This code is running in a thread");
	}
}
