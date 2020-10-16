package org.java.core;

import java.util.Scanner;

enum Gender {
	Male, Female, Transgender;
}

public class WrapperInheritancePolymor {

	public static void main(String[] args) {
		Student stu=new Student();
		stu.accept();
		stu.display();
		Employee emp=new Employee();
		emp.accept();
		emp.display();
	}

}

class Person1 {
	private String name;
	private String address;
	private Gender gender;
	private long contact;

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name:-");
		name = sc.nextLine().toUpperCase();
		System.out.println("Enter the Address of " + name);
		address = sc.nextLine().toUpperCase();
		System.out.println("enter the Gender [M/F/T]:-");
		char gen = (sc.next()).toUpperCase().charAt(0);
		gender = gen == 'M' ? Gender.Male : gen == 'F' ? Gender.Female : Gender.Transgender;
		System.out.println("Enter the Contact Number");
		contact = sc.nextLong();
	}

	public void display() {
		System.out.println(
				"Name:- " + name + "\t Gender:-" + gender + "\nAddress:-" + address + "\t Contact:-" + contact);

	}

}

class Student extends Person1 {
	private String roll;
	private String course;

	public void accept() {
		super.accept();
		System.out.println("Enter your Roll Number:-");
		Scanner sc = new Scanner(System.in);
		roll = sc.nextLine().toUpperCase();
		System.out.println("Enter Course Name");
		course = sc.next().toUpperCase();
	}

	public void display() {
		System.out.println("Roll Number:-" + roll + "\t Course:-" + course);
		super.display();
	}
}

class Employee extends Person1 {
	private String empId;
	private String department;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmployeeId");
		empId=sc.next();
		System.out.println("Enter Department name:-");
		department=sc.next();
		super.accept();
	}
	public void display()
	{
		System.out.println("EmpId:-"+empId+"\tDept:-"+department);
		super.display();
	}
}