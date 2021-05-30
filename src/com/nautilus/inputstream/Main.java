package com.nautilus.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) {

		System.out.println("Hello input stream");
		
		byte[] array = new byte[100];

		try {
			InputStream input = new FileInputStream("/home/nautilusshell/Desktop/input.txt");
			
			System.out.println("Avaiable bytes in the file: " + input.available());
			
			input.read(array);
			System.out.println("Data read from the file: ");
			
			System.out.println("\nByteData");
			for (byte b: array) {
				System.out.println(b);
			}
			
			System.out.println("\nStringData");
			System.out.println(new String(array,StandardCharsets.UTF_8));
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
