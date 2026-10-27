package com.logical;

public class PerfectNumber {
	public static void main(String[] args) {
		int num = 28;
		int sum = 0;
		int i = 1;
		while (i <= num / 2) {

			if (num % i == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum == num ? "Perfect Number" : "Not Perfect");
	}
}
