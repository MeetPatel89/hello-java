package com.nautilus.csvfilehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import com.opencsv.CSVReader;

public class CSVFileHandler {

	public static void readDataLineByLine(String file) throws IOException {

		CSVReader csvReader = null;

		try {
			FileReader fileReader = new FileReader(file);

			csvReader = new CSVReader(fileReader);

			String[] nextRecord = csvReader.readNext();

			while (nextRecord != null) {
				for (String cell : nextRecord) {
					System.out.println(cell + "\t");
				}
				System.out.println();
				nextRecord = csvReader.readNext();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			csvReader.close();
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello CSVFileHandler!");
		try {
			CSVFileHandler.readDataLineByLine("/home/nautilusshell/eclipse-workspace/April12Training/SeleniumDemoQa/target/test-classes/basses.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
