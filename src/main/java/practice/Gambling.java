package practice;

import java.util.Random;
import java.util.Scanner;

public class Gambling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Wie viel wollen Sie einzahlen? ");
		int konto = scanner.nextInt();
		System.out.println("Alles klar! Ihr Kontostand beträgt: " + konto);

		while (true) {

			System.out.println("Wie viel wollen sie setzen?");
			int bet = scanner.nextInt();
			int a = random.nextInt(1, 7);
			int b = random.nextInt(1, 7);
			int c = random.nextInt(1, 7);
			
			System.out.println("|-----------|");
			System.out.println("|           |");
			System.out.println("|- " + a + "  " + b + "  " + c + " -|");
			System.out.println("|           |");
			System.out.println("|-----------|");
			
			
			
			if (a == b || b == c || a == c) {
				if (a == b && a == c) {
					System.out.println("JACKPOT: ");
					konto = konto + (bet * 4);
				} else {
					System.out.println("Sie haben gewonnen!!! \nIhr Einsatz verdoppelt sich");
					konto = konto + (bet);
				}
			} else {
				System.out.println("Sie haben leider verloren... \nGleich nochmal probieren :)");
				konto = konto - bet;
			}
			
			if(konto <= 0) {
				System.out.println("Sie haben kein Kapital mehr. Kommen Sie mit mehr wieder!");
				break;
			}
			
			
			System.out.println("Ihr neuer Kontostand beträgt: " + konto);
			
			System.out.println("Wollen Sie nochmal eine Runde drehen? (y/n)");
			char answer = scanner.next().charAt(0);
			if (answer == 'n') {
				System.out.println("Schade... Auf Wiedersehen.");
				break;
			} else {
				continue;
			}

		}
		scanner.close();

	}

}
