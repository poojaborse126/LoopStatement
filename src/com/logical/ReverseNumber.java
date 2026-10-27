//Logic: Extract the last digit using % 10 and build the reversed number. 

package com.logical;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 12345;
		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reverse: " + reverse);
	}
}
