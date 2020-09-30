package org.java.core;
/*
 * Write a Java Program to create multiple class in a single java file,try to explicitly invoke the main of second class from 1st Class main()
 */
public class DoubleMain {

	public static void main(String[] args) {
		System.out.println("DoubleMainClass Main");
		AnotherMainClass.main(args);
	}

}
 class AnotherMainClass{
	public static void main(String ...strings)
	{
		System.out.println("Another Class Main");
	}
}
