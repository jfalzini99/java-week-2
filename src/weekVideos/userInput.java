package weekVideos;

import java.util.Scanner;

// WEEK 2 VIDEOS - User Input
// EDITTED BY - Joseph Falzini

public class userInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		
		System.out.println("Hello, " + name);
		
		int selection = 0;
		double total = 0;
		
		while (selection != 4) {
			System.out.println("Select an option.");
			System.out.println("1) add candybar to shopping cart: $1.99");
			System.out.println("2) add cheese to shopping cart: $6.95");
			System.out.println("3) add soccer ball to shopping cart: $12.99");
			System.out.println("4) check out");
			
			selection = in.nextInt();
			
			switch (selection) {
				case 1:
					total += 1.99;
					break;
				case 2:
					total += 6.95;
					break;
				case 3:
					total += 12.99;
					break;
				case 4:
					break;
				default:
					System.out.println("please pick a valid option.");
			}
		}
		
		System.out.println("Your current total is: " + total);
	}

}
