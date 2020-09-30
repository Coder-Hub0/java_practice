package org.java.core;
/*
 * Write a Java Program to overload the main(),note down the signatue of main method,
 * from where program execution started
 */


public class MainOverloaded {

	public static void main(String[] args) {
		System.out.println("Main 1");
	}
	public static void main()
	{
		System.out.println("Main without parameter");
	}
	public static void main(Integer ...integers )
	{
		System.out.println("Main with Integer parameter");
	}
	public static void main(String string)
	{
		System.out.println("Main with string");
	}

}
