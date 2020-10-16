package org.java.core;

public class MyStringBuffer {
	public static void main(String... args) {
		StringBuffer str = new StringBuffer("Hello Jims Students");
	System.out.println("Capacity:-"+str.capacity());
	str.setLength(100);
	System.out.println("Extended Capicity:-"+str.capacity());
	System.out.println("10th char :-"+str.charAt(11));
	

	}
}
