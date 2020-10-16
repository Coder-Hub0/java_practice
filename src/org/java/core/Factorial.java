package org.java.core;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Integer number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		System.out.println("Factorial:-"+factorial(number));
	}
	public static Integer factorial(Integer number)
	{
		if(number<=1)
		{
			return 1;
		}
		else
			return number*factorial(number-1);
	}
}
