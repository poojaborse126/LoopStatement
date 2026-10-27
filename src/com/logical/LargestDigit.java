package com.logical;

public class LargestDigit {
	public static void main(String[] args) {
		int num = 58392;
		int largest = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit > largest) {
				largest = digit;
			}
			num /= 10;
		}
		System.out.println("Largest Digit: " + largest);
	}
}
