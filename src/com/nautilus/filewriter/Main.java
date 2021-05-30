package com.nautilus.filewriter;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		
		char[] charArray = {82, 65, 78, 13, 84, 104, 32, 105, 115, 46};
		try {
			
			// Creates a Writer using FileWriter
			FileWriter output = new FileWriter("/home/nautilusshell/Desktop/input.txt");
			
			// Writes charArray to the file
			output.write(charArray);
			System.out.println("Data is written to the file");
			
			// Closes the writer
			output.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
