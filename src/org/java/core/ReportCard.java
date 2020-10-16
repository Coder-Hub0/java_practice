/**
 * 
 */
package org.java.core;

import java.util.Scanner;

/**
 * @author demonvilla
 *Write a java program to display grade of students depends on marks. 100-80 [A],79-60[B],59-40[C], <40 [F]? 
 */
public class ReportCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportCard obj=new ReportCard();
		System.out.println("Grade:-"+obj.Marks());
	}
	public char gradeCal(int totalMarks)
	{
		char grade;
		totalMarks/=5;
		if(totalMarks<=100 && totalMarks>=80)
		{
			grade='A';
		}
		else if(totalMarks<=79 && totalMarks>=60)
		{
			grade='B';
		}
		else if(totalMarks<=59 && totalMarks>=40)
		{
			grade='C';
		}
		else
			grade='F';
		return grade;
	}
	public char Marks()
	{
		Scanner sc=new Scanner(System.in);
		Integer sum=0,mark[]=new Integer[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Marks:-");
			mark[i]=sc.nextInt();
			sum+=mark[i];
		}
		return gradeCal(sum);
	}

}
