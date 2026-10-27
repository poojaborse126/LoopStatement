package com.logical;

public class LCM {
	public static void main(String[] args) {
		int a = 12, b = 18;
		int x = a, y = b;
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		int lcm = (a / x) * b;
		System.out.println("LCM: " + lcm);
	}
}
