package org.java.core;

import java.util.Scanner;
/*
 * Write a java program to print table from 0 to accepted number,using loops and keyboards inputs
 */
public class TableExample {

	public static void main(String[] args) {

		Integer val;
		System.out.println("Enter the value:-");
		val=(new Scanner(System.in)).nextInt();
		for(int k=1;k<11;k++)
		{
			System.out.println(val+" * "+k+"="+val*k);
		}
	}
	

}
