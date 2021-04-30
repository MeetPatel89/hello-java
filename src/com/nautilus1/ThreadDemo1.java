package com.nautilus1;

public class ThreadDemo1 extends Thread {
	public static void main(String[] args) {
		ThreadDemo1 thread = new ThreadDemo1();
		
		// starts the thread
		thread.start();
		
		// synchronous code from main thread
		System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");
	}
}
