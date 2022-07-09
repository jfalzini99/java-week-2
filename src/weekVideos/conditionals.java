package weekVideos;

// WEEK 2 VIDEOS - Conditionals
// EDITTED BY - Joseph Falzini

public class conditionals {

	public static void main(String[] args) {
		String name = "Joseph";
		//String name = "Tom";
		
		if (name == "Joseph") {
			System.out.println("Hello Joseph!");
		} else {
			System.out.println("You are not Joseph, " + name + "!");
		}
		
		//int age = 22;
		int age = 14;
		
		if (age >= 16) {
			System.out.println("You can get your license!");
		} else {
			// System.out.println("Please wait until you are  16 years old.");
			System.out.println("Please wait " + (16 - age) + " years to get your license.");
		}
		
		double costOfMilk = 4;
		
		if (costOfMilk <= 2) {
			System.out.println("Buying 2 gallons.");
		} else if (costOfMilk <= 3) {
			System.out.println("Buying 1 gallon.");
		} else {
			System.out.println("Not buying any milk.");
		}
		
		//char grade = 'A';
		char grade = 'D';
		
		switch (grade) {
			case 'A': 
				System.out.println("90%");
				break;
			case 'B':
				System.out.println("80%");
				break;
			case 'C':
				System.out.println("70%");
				break;
			default:
				System.out.println("0%");
		}
		
		if (5 == 5) {
			if (4 == 3) {
				System.out.println("5 is 5 and 4 is 4");
			} else {
				System.out.println("5 is 5");
			}
		}
		
		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}
	}

}
