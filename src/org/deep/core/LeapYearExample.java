package org.deep.core;

public class LeapYearExample {
	public static void main(String... strings) {
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("LEAP YEAR");
		}
		else
		{
			System.out.println("COMMON YEAR");
		}

	}
}
