package org.java.core;
/*
 * Write a java program to print alphabets [small case & upperCase] on screen [using for loop]
 */
public class CaseConverstion {

	public static void main(String[] args) {
		char c='A';
		for(int i=0;i<26;i++)
		{
			System.out.println(c+"\t"+(char)(c+32));
			c++;
		}
		
	}

}
