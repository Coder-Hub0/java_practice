package org.java.core;

import java.util.Scanner;

/*
 * Topic:Classes and Methods
Questions:Write a java program create class Person, use methods accept() [For accepting details] & display() [For displaying details]. Use main as starting point and call both the method. Accept following details: Name, Gender, Address, Contact no.  
 */
class Person {
	private String name;
	private String gender;
	private long contact;
	private String address;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name = sc.nextLine();
		System.out.println("Enter your gender");
		gender = sc.next();
		System.out.println("Enter Your Residential Address:-");
		address=sc.next();
		System.out.println("Enter your Contact Number:-");
		contact = sc.nextLong();
		
	}

	public void display() {
		System.out.println("Name:" + name);
		System.out.println("\t gender:" + gender);
		System.out.println("\nMob:-" + contact);
		System.out.println("\taddress" + address);
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1 = new Person();
		obj1.accept();
		obj1.display();
	}

}
