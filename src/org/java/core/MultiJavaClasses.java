package org.java.core;

/*
 * Write a Java Program to create a multiple classes in a single java file and try to execute both the classes
 */
public class MultiJavaClasses {

	public static void main(String[] args) {
		System.out.println("MultiJavaClass Called");
	}

}
class AnotherClass{
	public static void main(String ...strings)
	{
		System.out.println("Another Class main Called");
	}
}
