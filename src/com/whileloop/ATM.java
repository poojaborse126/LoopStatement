//Scenario: A banking application allows the customer a maximum of three 
//attempts to enter the correct PIN.
package com.whileloop;

public class ATM {
	public static void main(String[] args) {
		int correctPin = 1234;
		int enteredPin = 1111;
		int attempts = 0;
		while (attempts < 3) {
			if (enteredPin == correctPin) {
				System.out.println("Access Granted");
				break;
			}
			attempts++;
			System.out.println("Wrong PIN");
			if (attempts < 3) {
				enteredPin = 1234;
			}
		}
		if (attempts == 3) {
			System.out.println("Card Blocked");
		}
	}
}
