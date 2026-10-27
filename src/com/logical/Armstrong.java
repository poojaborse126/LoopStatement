package com.logical;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int digits = 0;
		int sum = 0;
		int n = num;
		while (n > 0) {
			digits++;
			n /= 10;
		}
		while (temp > 0) {
			int digit = temp % 10;
			sum += (int) Math.pow(digit, digits);
			temp /= 10;
		}
		if (num == sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong");
	}
}
