package org.java.core;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = args.length;
		int sum = 0;
		if (len > 0) {
			for (String k : args) {
				sum += Integer.parseInt(k);
				System.out.println("Average is:- " + (float) sum / len);
			}
		} else {
			System.out.println("can not find the Average your pass 0 values");
		}
	}
}
