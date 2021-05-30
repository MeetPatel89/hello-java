package com.nautilus.filereader;

import java.io.FileReader;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Hello file reader");
		
		char[] array = new char[100];
		
		try {
			// Creates a reader using the FileReader
			FileReader input = new FileReader("/home/nautilusshell/Desktop/input.txt");
			
			// Reads characters
			input.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			
			// Closes the reader
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
