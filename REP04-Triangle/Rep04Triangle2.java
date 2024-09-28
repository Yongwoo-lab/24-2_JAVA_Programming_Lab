package REP04_22200143;

import java.util.Scanner;

public class Rep04Triangle2 {
	public static void main(String[ ] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);

		do  {
			System.out.print("Enter a number(1-50): ");
			num = keyboard.nextInt();
			if (num < 1 | num > 50) {
				System.out.println("Wrong number! try again.");
			}
		} while(num < 1 | num > 50);
		System.out.println("You entered "+num+".");
		for (int i=0; i<num; i++) {
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		keyboard.close();
	}
}
