package com.nautilus.csvfilehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

	public static void readAllDataAtOnce(String file) {
		try {

			FileReader fileReader = new FileReader(file);

			CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();

			List<String[]> allData = csvReader.readAll();

			for (String[] row : allData) {
				for (String cell : row) {
					System.out.println(cell + "\t");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello CSVFileHandler!");

		CSVFileHandler.readAllDataAtOnce(
				"/home/nautilusshell/eclipse-workspace/April12Training/SeleniumDemoQa/target/test-classes/basses.csv");

	}
}
