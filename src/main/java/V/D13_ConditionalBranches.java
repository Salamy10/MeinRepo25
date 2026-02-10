package V;

import java.util.Scanner;

public class D13_ConditionalBranches {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte Alter eingeben: ");
		int age = scanner.nextInt();

		// variable mit bedingung deklarieren
		String ageText;
		if (age < 18) {
			ageText = "minderjährig";
		} else {
			ageText = "volljährig";
		}
		System.out.println("Du bist " + ageText);

		// Kurzform
		ageText = (age < 18) ? "minderjährig" : "volljährig"; // kurzschreiweise
		System.out.println("Du bist " + ageText);

	}

}
