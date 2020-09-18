package org.deep.core;

public class SwitchCaseBreakExample {
	public static void main(String... strings) {
		int number = 20;
		switch (number) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		// Default case statement
		default:
			System.out.println("Not in 10,20 or 30");
		}
	}

}
