package report_2;

import java.util.Scanner;

public class Rep02VendingChange1 {
	public static void main(String[] args) {
		int price, change;
		System.out.println("Enter price of item (from 25 cents to a dollar, in 5-cent increments):");
		Scanner keyboard = new Scanner(System.in);
		price = keyboard.nextInt();
		if (price % 5 != 0 | price < 25 | price > 100) {
			System.out.println("Invalid price. Please enter a value between 25 and 100, in 5-cent increments.");

		} else {

			change = 100 - price;
			System.out.println("You bought an item for " + price + " cents and gave me a dollar, so your change is: "
					+ change + " cents.");
		}
	}
}
