package org.java.core;

/*
 * write a Java program to overload the main(),try to invoke overloaded main() int he main method from where program execution started?
 */
public class OverloaderMainInvoke {

	public static void main(String[] args) {
		System.out.println("Main with String []");
		main();
	}

	public static void main(Integer... args) {
		System.out.println("Main with Integer parameter");
	}

	public static void main(String args) {
		System.out.println("Main with String parameter");
		main(123, 123);
	}

	public static void main() {
		System.out.println("Main without Parameter");
		main("abc");
	}

}
