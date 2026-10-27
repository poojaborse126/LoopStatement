package com.logical;

public class ArmstrongRange {
	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
			int temp = num;
			int digits = String.valueOf(num).length();
			int sum = 0;
			while (temp > 0) {
				int digit = temp % 10;
				sum += (int) Math.pow(digit, digits);
				temp /= 10;
			}
			if (sum == num) {
				System.out.print(num + " ");
			}
		}
	}
}
