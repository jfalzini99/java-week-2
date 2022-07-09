package week2Lab;

// WEEK 2 LAB
// EDITTED BY - Joseph Falzini

public class BooleanConditionalsLoops {

	public static void main(String[] args) {
		
		int age = 14;
		
		System.out.println(age >= 16);
		age = 17;
		System.out.println(age >= 16);
		
		boolean hasLicense = true;
		//boolean hasLicense = false;
		
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive.");
		} else {
			System.out.println("You canno drive");
		}
		
		//double costOfMilk = 4.15;
		double costOfMilk = 2.00;
		//int thirstLevel = 8;
		int thirstLevel = 4;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk pleas.");
		} else {
			System.out.println("No thank you.");
		}
		
		int numOfCookies = 5;
		int numOfKids = 2;
		
		//		if (numOfCookies% numOfKids > 5) { 
		//		System.out.println("Jackpot!");
		//	} else if (numOfCookies % numOfKids >= 2) {
		//		System.out.println("WoooooHooooooo!");
		//	} else if (numOfCookies % numOfKids > 0) {
		//		System.out.println("Yes!");
		//	} else {
		//		System.out.println(":(");
		//	}
		
		int leftovers = numOfCookies % numOfKids;
		
		if (leftovers > 5) {
			System.out.println("Jackpot!");
		} else if (leftovers >= 2) {
			System.out.println("WoooooHoooo!");
		} else if (leftovers > 0) {
			System.out.println("Yes!");
		} else {
			System.out.println(":(");
		}
		
		// VIDEO 2
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = .1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
		}
		
		System.out.println(loyaltyMemberDiscount);
		
		double billTotal = 24.37;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER" ) {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
		System.out.println(loyaltyMemberStatus);
	
		String username = "jfalzini";
		String password = "password123";
		
		if (username.equals("jfalzini") && password.equals("password123")) {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " EVEN");
			} else {
				System.out.println(i + " ODD");
			}
		}
		
		int i = 100;
		while (i > 0) {
			System.out.println(i + " " + (i % 3));
			i--;
		}
	}

}
