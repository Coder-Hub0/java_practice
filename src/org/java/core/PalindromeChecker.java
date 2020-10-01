package org.java.core;

import java.util.Scanner;
/*
 * Write a java program to check if number is "palindrome" or not.
 */
public class PalindromeChecker {

	public static void main(String[] args) {
		Integer val;
		System.out.println("Enter the Value ");
		val = (new Scanner(System.in)).nextInt();
		System.out.println(val + " is " + checkPalindrome(val));

	}

	public static String checkPalindrome(Integer val) {
		Integer val1 = val;
		Integer rem = 0;
		while (val1 > 0) {
			rem = rem * 10 + val1 % 10;
			val1 = val1 / 10;
		}
		if (rem == val)
			return "Palindrome";
		else
			return "not Palindrome";
	}

}
