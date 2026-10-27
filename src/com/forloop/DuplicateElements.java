/*Logic: Compare each element with subsequent elements using nested loops. 
Print each duplicate value only once. */
package com.forloop;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 40, 10 };
		for (int i = 0; i < arr.length; i++) {
			boolean alreadySeen = false;
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					alreadySeen = true;
					break;
				}
			}
			if (alreadySeen) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}
