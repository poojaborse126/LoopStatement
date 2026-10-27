package com.logical;

public class Power {
	public static void main(String[] args) {
		int base = 2;
		int exponent = 5;
		int result = 1;
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		System.out.println("Power: " + result);
	}
}
