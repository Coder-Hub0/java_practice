package org.java.core;

import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		double a,b;
		String op;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st Number:-");
		a=sc.nextDouble();
		System.out.print("\nEnter the 2nd Number:-");
		b=sc.nextDouble();
		System.out.println("Enter the Operand");
		op=sc.nextLine();
		switch(op)
		{
		case "+":System.out.println(add(a,b));break;
		
		case "-": System.out.println(minus(a,b));break;
		case "*":System.out.println(mul(a,b));break;
		case "/":System.out.println(divide(a,b));break;
		case "%":System.out.println(mod(a,b));break;
		}
	}
	public static double add(double a,double b)
	{
		return a+b;
	}
	public static double minus(double a,double b)
	{
		return a-b;
	}
	public static double divide(double a,double b)
	{
		return a/b;
	}
	public static double mod(double a,double b)
	{
		return a%b;
	}
	public  static double mul(double a,double b)
	{
		return a*b;
	}
}
