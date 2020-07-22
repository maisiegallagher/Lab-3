import java.util.Scanner;

public class IfElseExercise {

	public static void main(String[] args) {

		// declare variables
		String name;
		int num;

		// open scanner
		Scanner scnr = new Scanner(System.in);

		// ask for user's name
		System.out.println("Hello! What is your first name?");
		name = scnr.next();
		
		System.out.println(name + ", please enter an integer between 1 and 100.");
		num = scnr.nextInt();
		int i = num;
		if (i % 2 == 0 && i >= 2 && i <= 25) {
			System.out.println("The number you entered is even and less than 25.");
		} else if (i % 2 == 0 && i >= 26) {
			System.out.println("The number you entered is even."); 
		} else if (i % 2 != 0 && i < 60) {
			System.out.println("The number you entered is odd.");
	} else {
			System.out.println("The number you entered is odd and over 60.");
		scnr.close();
	}
	}
}
