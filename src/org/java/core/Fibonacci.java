package org.java.core;

import java.util.Scanner;

/*
 * Write a java program to check input no is part of Fibonacci series or not?
 * print Fibonacci series till that point
 */
public class Fibonacci {
	
	public static void main(String ...strings)
	{
		int number;
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		fibonacci(number);
		
	}
	public static void fibonacci(Integer number)
	{
		int a=0,b=1,c=0,i;
		System.out.print(a+" "+b);
		for(i=2;c<number;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		if(c!=number)
			System.out.println("\n"+ "Not in Fibonacci series");
		else
			System.out.println("\n In Fibonaaci series at "+i );
	}
}
