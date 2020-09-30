package org.java.core;

/*
 * Write a java Program to create multiple Classes in single java file and prefix public with both the classes and execute it note down the output
 */
public class PublicTwoClasses {

	public static void main(String[] args) {

		String[] arr = { "Helolo", "how are you" };
		System.out.println("HEllo I am Pro3 class main method");
		PRO.main(arr);
	}

}

class PRO {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
