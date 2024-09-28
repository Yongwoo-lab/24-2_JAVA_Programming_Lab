package report_2;

import java.util.Scanner;

public class Rep02VendingChange3 {
	public static void main(String[] args) {
		String choice;
		Scanner keyboard = new Scanner(System.in);
		do {
			int price, change, quarters, dimes, nickels;
			System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cent increments): ");
			price = keyboard.nextInt();
			if (price % 5 != 0 | price < 25 | price > 100) {
				System.out.println("Invalid price. Please enter a value between 25 and 100, in 5-cent increments.");
			} else {

				change = 100 - price;
				System.out.println("You bought an item for " + price + " cents and gave me a dollar,");
				System.out.println("so your change is:");

				quarters = change / 25;
				change = change % 25;
				if (quarters > 1) {
					System.out.println(quarters + " quarters");
				}
				else if (quarters == 1) {
					System.out.println(quarters + " quarter");
				}

				dimes = change / 10;
				change = change % 10;
				if (dimes > 1) {
					System.out.println(dimes + " dimes");
				}
				else if (dimes == 1) {
					System.out.println(dimes + " dime");
				}

				nickels = change / 5;
				if (nickels > 0) {
					System.out.println(nickels + " nickel");
				}
			}

			do {
			System.out.print("Do you want to enter another price? (yes/no): ");
			choice = keyboard.next();
			} while (!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"));
			
		} while (choice.equalsIgnoreCase("yes"));
		System.out.print("Thank you for using the vending machine!");
		keyboard.close();
	}
}
