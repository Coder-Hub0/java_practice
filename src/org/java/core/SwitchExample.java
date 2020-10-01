package org.java.core;

import java.util.Scanner;

/*
 * Write a java program to convert Celsius into Fahrenheit[Note: Accept value from user] Write a java program to check entered number is "even" or "odd" display message accordingly?
 * 
 */
public class SwitchExample {

	public static void main(String[] args) {
		Double val;
		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("\n1.) Convert Celsius to Fhrenheit \n2.Check Even or Odd");
		System.out.println("Enter your choice:-");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("enter the Celsius Value:- ");
			val = sc.nextDouble();
			System.out.println(val + "C = " + CelsiusToFahrenheit.celToFah(val) + " F");
			;
			break;
		case 2:
			System.out.println("Enter the Value");
			val = sc.nextDouble();
			System.out.println(val + " is " + CelsiusToFahrenheit.EvenOrOdd(val));
		}
		
	}

}

class CelsiusToFahrenheit {
	public static double celToFah(Double celsius) {
		return (celsius * 9 / 5) + 32;
	}

	public static String EvenOrOdd(Double val) {
		if (val % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
}
