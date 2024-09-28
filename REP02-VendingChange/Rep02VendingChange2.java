package report_2;

import java.util.Scanner;

public class Rep02VendingChange2 {
	public static void main(String[] args) {

		int price, change, quarters, dimes, nickels;
		System.out.println("Enter price of item (from 25 cents to a dollar, in 5-cent increments):");
		Scanner keyboard = new Scanner(System.in);
		price = keyboard.nextInt();
		if (price % 5 != 0 | price < 25 | price > 100) {
			System.out.println("Invalid price. Please enter a value between 25 and 100, in 5-cent increments.");
		} else {

			change = 100 - price;
			System.out.println("You bought an item for " + price + " cents and gave me a dollar, so your change is:");

			quarters = change / 25;
			change = change % 25;

			dimes = change / 10;
			change = change % 10;

			nickels = change / 5;

			System.out.println(quarters + " quarters,");
			System.out.println(dimes + " dimes,");
			System.out.println(nickels + " nickels.");
		}
	}
}
