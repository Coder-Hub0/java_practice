package org.java.core;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		ArrayClass obj = new ArrayClass(10);
		obj.insert();
		obj.show();
		obj.descending();
		obj.asscendingOrder();
		obj.AvSumMinMax();
		System.out.println("Odd Values");
		obj.printOdd();
		System.out.println("Even Values");
		obj.printEven();
	}

}

class ArrayClass {
	private Integer[] arr;
	int sum;

	public ArrayClass(int n) {
		arr = new Integer[n];
	}

	void insert() {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values");
		for (i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
			sum += arr[i];
		}
	}

	int descending() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					swap(i, j);
				}

			}
		}
		show();
		return 1;
	}

	public int asscendingOrder() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(i, j);
				}

			}
		}
		show();
		return 1;
	}

	public void show() {
		for (Integer a : arr) {
			System.out.print(a + "\t");
		}
		System.out.println();
	}

	public void AvSumMinMax() {
		System.out.println("Average:-" + sum / arr.length + "\tMin:-" + arr[0] + "\tMax:-" + arr[arr.length - 1]);
	}

	public void swap(int i, int j) {
		arr[i] += arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}

	public void printOdd() {
		for (Integer i : arr) {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
			}
		}
	}

	public void printEven() {
		for (Integer a : arr) {
			if (a % 2 == 0) {
				System.out.print(a+"\t");
			}
		}
	}

}
