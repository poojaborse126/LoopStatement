package com.logical;

public class StrongNumber {
	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			int fact = 1;
			int i = 1;
			while (i <= digit) {
				fact *= i;
				i++;
			}
			sum += fact;
			temp /= 10;
		}
		System.out.println(sum == num ? "Strong Number" : "Not Strong");
	}
}
