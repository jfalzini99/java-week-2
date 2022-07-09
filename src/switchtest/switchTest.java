package switchtest;

import java.util.List;

public class switchTest {

	public static void main(String[] args) {
		new switchTest().run();
	}
	
	private void run() {
//		traditionalForLoop();
//		whileLoop();
//		doWhileLoop();
		
		enhanced();
		
//		testBoolean();
		
//		// Turn  number grade into letter grade
//		testSwitch(100);
//		testSwitch(95);
//		testSwitch(85);
//		testSwitch(75);
//		testSwitch(65);
//		testSwitch(55);
//		testSwitch(5);
//		testSwitch(-5);
//		testSwitch(105);
//		
//		System.out.println(""); // Blank line for Console Formatting!
//		
//		testIf(100);
//		testIf(95);
//		testIf(85);
//		testIf(75);
//		testIf(65);
//		testIf(55);
//		testIf(5);
//		testIf(-5);
//		testIf(105);
	}
	
	private void enhanced() {
		List<String> names = List.of("Bill", "Sue", "Frank", "Mary");
		
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	private void doWhileLoop() {
		int counter = 0;
		
		do {
			System.out.println(counter);
			counter++;
		} while (counter <= 0);
			
	}
	
	private void  whileLoop() {
		int counter = 0;
		
		while (counter <= 50) {
			if (counter % 2 == 1) {
				System.out.println(counter);
			}
			
			counter += 1;
		}
	}
	
	private void traditionalForLoop() {
		
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
	private void testBoolean() {
		// System.out.println(makeTrue() && makeTrue());
		// System.out.println(makeFalse() && makeTrue());
		System.out.println(makeTrue() || makeFalse());
	}
	
	private boolean makeTrue() {
		System.out.println("makeTrue");
		return true;
	}
	
	private boolean makeFalse() {
		System.out.println("makeFalse");
		return false;
	}
	
	private void testIf(int numberGrade) {
		String letterGrade = "";
		
		if (numberGrade < 0 || numberGrade > 100) {
			System.out.println("A number grade of " + numberGrade + " is invalid!");
		} else {
			int grade = numberGrade / 10;
			
			if (grade >= 9) {
				letterGrade = "A.";
			} else if (grade >= 8) {
				letterGrade = "B.";
			} else if (grade >= 7) {
				letterGrade = "C.";
			} else if (grade >= 6) {
				letterGrade = "D.";
			} else {
				letterGrade = "F.";
			}
			
			System.out.println("For a number grade of " + numberGrade + ", you received a letter grade of " + letterGrade);
		}
	}
	
	private void testSwitch(int numberGrade) {
		String letterGrade = "";
		
		if (numberGrade < 0 || numberGrade > 100) {
			System.out.println("A number grade of " + numberGrade + " is invalid!");
		} else {
			int grade = numberGrade / 10;
			
			switch (grade) {
				case 10:
				case 9:
					letterGrade = "A.";
					break;
				case 8:
					letterGrade = "B.";
					break;
				case 7:
					letterGrade = "C.";
					break;
				case 6:
					letterGrade = "D.";
					break;		
				default:
					letterGrade = "F.";
					break;
			}
			
			System.out.println("For a number grade of " + numberGrade + ", you received a letter grade of " + letterGrade);
		}
		
	}
}
