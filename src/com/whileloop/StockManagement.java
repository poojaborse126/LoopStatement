//Scenario: An online shopping website has 10 products available. Every 
//successful order reduces the stock by one. 
package com.whileloop;

public class StockManagement {
	public static void main(String[] args) {
		int stock = 10;
		while (stock > 0) {
			System.out.println("Order Placed");
			stock--;
			System.out.println("Remaining Stock: " + stock);

		}
		System.out.println("Out of Stock");
	}
}
