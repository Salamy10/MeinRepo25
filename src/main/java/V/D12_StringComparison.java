package V;

import java.util.Scanner;

public class D12_StringComparison {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte die Zeichenkette \"true\" eingeben: ");
		String input = scanner.next();

		if (input == "true") {		//primitive datentypen mit "=="

			System.out.println("Gut gemacht");

		} else {
			System.out.println("Leider falsch");
		}
		
		
		if(input.equals("true")) {	//String = Klasse => "v.equals("bedingung")"

			System.out.println("Gut gemacht");

		} else {
			System.out.println("Leider falsch");
		}

	}
}
