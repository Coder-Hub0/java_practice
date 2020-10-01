/**
 * 
 */
package org.java.core;

import java.util.Scanner;

/**
 * @author Deepanshu Write a java program to accept number from user[Note: Using
 *         While loop] as long as user wants to enter save them in
 *         array[size:20] and display using for each loop
 */
public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer choice = 1, index = 0, arr[] = new Integer[20];
		Scanner sc = new Scanner(System.in);
		while (choice != 0) {
			System.out.println("Enter Number:-");
			arr[index++] = sc.nextInt();
			System.out.println("\n Do you want continue[1=yes,0=No]:-");
			choice = sc.nextInt();

		}
		System.out.println("Values in Array");
		for (Integer val : arr) {
			if (val != null)
				System.out.println(val);
		}
	}

}
