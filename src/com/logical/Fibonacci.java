package com.logical;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1;
		int count = 10;
		while (count > 0) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
			count--;
		}
	}
}
