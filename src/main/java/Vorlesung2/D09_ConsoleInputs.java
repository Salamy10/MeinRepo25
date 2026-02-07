package P1;

import java.util.Scanner;

public class D09_ConsoleInputs {

	public static void main(String[] args) {
		//scanner initalisieren
		Scanner scanner = new Scanner(System.in); //Sicher Klausur weil interaktion
		
		//werte auslesen und zurückgeben
		System.out.print("Btte eine ganze Zahl eingeben: ");	//print ohne ln => ohne zeilenumbruch
		int i1 = scanner.nextInt();
		System.out.println("Eingabe Int: " + i1);
		
		System.out.print("Bitte eine reelle Zahl eingeben: ");
		double d1 = scanner.nextDouble();
		System.out.println("Eingabe Double: " + d1);
		
		System.out.print("Bitte einen boolschen Wahrheitswert eingeben: ");
		boolean b1 = scanner.nextBoolean();
		System.out.println("True oder False: " + b1);
		
		System.out.print("Bitte ein einzelnes Zeichen eingeben: ");
		char c1 = scanner.next().charAt(0);	//verbindung zwischen scanner.next() und chatAt(x) muss in Klausur eigen erstelle werden
		System.out.println("Erstes Zeichen der Eingabe: " + c1);
		
		System.out.print("Bitte ein einzelnes Wort eingeben: ");
		String s1 = scanner.next();
		System.out.println("Einzelnes Wort: " + s1);
		
		System.out.print("Bitte beliebig viele Wörter eingeben: ");
		scanner.nextLine();
		String s2 = scanner.nextLine();	//vorige next. methode beeinflusst diese (Enter bleibt übrig)
		//Entweder nextLine als erste Methode oder füge Scanner.nextLine darber hinzu
		System.out.println("Beliebig viele Wörter: " + s2);
	}

}
