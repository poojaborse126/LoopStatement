package com.logical;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		long fact = 1;
		while (num > 1) {
			fact *= num;
			num--;

		}
		System.out.println("Factorial: " + fact);
	}
}
