package com.nautilus.designpatterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GenerateBill {
	
	public static void main(String[] args) throws IOException {
		
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name for which the bill will be generated: ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = bufferedReader.readLine();
		
		System.out.println("Enter the number of units for which bill will be calculated: ");
		int units = Integer.parseInt(bufferedReader.readLine());
		
		Plan plan = planFactory.getPlan(planName);
		
		System.out.println("Bill amount for " + planName + " of " + units + " units is: ");
		plan.getRate();
		plan.calculateBill(units);
	}
}
