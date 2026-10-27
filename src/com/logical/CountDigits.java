package com.logical;

public class CountDigits {
	public static void main(String[] args) {
		int num = 12345;
		int count = 0;
		if (num == 0) {
			count = 1;
		}
		while (num != 0) {
			count++;
			num /= 10;
		}
		System.out.println("Digits: " + count);
	}
}
