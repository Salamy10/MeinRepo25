package V;

import java.util.Scanner;

public class D11_Branches {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte Alter eingeben ");
		int age = scanner.nextInt();

		// Einfachverzweigung
		if (age < 18) {
			System.out.println("Du bist minderjährig!! - Fuck u");
		} else {
			System.out.println("Du bist volljährig!!");
		}
//		if (age >= 18){
//			System.out.println("Du bist volljährig!!");}

		/* Verschchtelte Verzweigungen */
		if (age < 12) {
			System.out.println("Du bist ein Kind!!");
		} else if (age < 18) {
			System.out.println("Du bist ein Jugendlicher!!");
		}

		else if (age < 65) {
			System.out.println("Du bist ein Erwachsener!!");
		}

		else {
			System.out.println("Du bist ein Alter Mensch!!");
		}

		
		/*Vergleichs-Operatoren: >, >=, <, <=, ==, != */		
		/*Logische Operatoren: && (logisches UND), || (Logisches ODER), ! (logische Vereinung*/

	}

}
