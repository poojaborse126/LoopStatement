package com.logical;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 17;
		boolean prime = num > 1;
		for (int i = 2; i <= num / i; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime ? "Prime Number" : "Not Prime");
	}
}
