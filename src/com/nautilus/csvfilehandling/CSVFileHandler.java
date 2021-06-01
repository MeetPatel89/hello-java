package com.nautilus.csvfilehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class CSVFileHandler {

	public static void readDataLineByLine(String file) throws IOException {

		CSVReader csvReader = null;

		try {
			FileReader fileReader = new FileReader(file);

			csvReader = new CSVReader(fileReader);

			String[] nextRecord = csvReader.readNext();

			while (nextRecord != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
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

	public static void readAllDataAtOnce(String file) {
		try {

			FileReader fileReader = new FileReader(file);

			CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();

			List<String[]> allData = csvReader.readAll();

			for (String[] row : allData) {
				for (String cell : row) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static HashMap<String,String> buildHashMapFromCSV(String key, String value, String filePath) throws IOException {
		FileReader fileReader = null;
		CSVReader csvReader = null;
		HashMap<String, String> csvHashMap = new HashMap<>();
		
		try {
			fileReader = new FileReader(filePath);
			
			csvReader = new CSVReader(fileReader);
			
			String[] csvHeaders = csvReader.readNext();
			
			int keyIndex = -1;
			int valueIndex = -1;
			
			for (int i = 0; i < csvHeaders.length; i++) {
				if (csvHeaders[i].equals(key)) {
					keyIndex = i;
				} 
				if (csvHeaders[i].equals(value)) {
					valueIndex = i;
				}
			}
			
			System.out.println(keyIndex);
			System.out.println(valueIndex);
			
			if (keyIndex == -1 || valueIndex == -1) {
				throw new RuntimeException("Key-Value should correspond to valid headers in csv file");
			}
			
			
			
			
			String[] nextRow = csvReader.readNext();
			
			while (nextRow != null) {
				System.out.println(nextRow[keyIndex]);
				System.out.println(nextRow[valueIndex]);
				csvHashMap.put(nextRow[keyIndex], nextRow[valueIndex]);
				nextRow = csvReader.readNext();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			csvReader.close();
		}
		return csvHashMap;
		
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Hello CSVFileHandler!");

		CSVFileHandler.readDataLineByLine(
				"/home/nautilusshell/eclipse-workspace/April12Training/SeleniumDemoQa/target/test-classes/basses.csv");
		HashMap<String, String> makeByModelHashMap = CSVFileHandler.buildHashMapFromCSV("Model", "Make", "/home/nautilusshell/eclipse-workspace/April12Training/SeleniumDemoQa/target/test-classes/basses.csv");
		System.out.println(makeByModelHashMap);
	}
}
