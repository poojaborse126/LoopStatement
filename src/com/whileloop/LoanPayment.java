//Scenario: A customer has an outstanding loan of ₹50,000 and pays ₹5,000 
//every month. Display the remaining loan balance after each payment. 
package com.whileloop;

public class LoanPayment {
	public static void main(String[] args) {
		int loan = 50000;
		int emi = 5000;
		int month = 1;
		while (loan > 0) {
			int payment = Math.min(emi, loan);
			loan -= payment;
			System.out.println("Month " + month + " Remaining Loan: " + loan);
			month++;
		}
	}
}
