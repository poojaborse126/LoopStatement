//Logic: Track the largest and second-largest distinct values while traversing the array.
package com.forloop;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 10, 50, 30, 80, 60 };
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > second) {
				second = arr[i];
			}
		}
		if (second == Integer.MIN_VALUE) {
			System.out.println("Second largest not available");
		} else {
			System.out.println("Second Largest: " + second);
		}
	}
}
