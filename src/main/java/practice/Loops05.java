package practice;

import java.util.Random;
import java.util.Scanner;

public class Loops05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int i = random.nextInt(11);
		int runden = 1;
		boolean wrong = true;
		while (wrong == true) {
			System.out.print("Rate eine Zahl zwischen 0 und 10: ");
			int answer = scanner.nextInt();

			if (answer == i) {
				System.out.println(
						"Das War Rchtig. Die Zahl war " + i + " und du hast " + runden + " Versuche benötigt.");
				break;
			} else {
				System.out.println("Das war falsch. ");
				runden++;

				if (answer < i) {
					System.out.println("Die Zahl ist größer!");
				} else if (answer > i) {
					System.out.println("Die Zahl ist kleiner!");
				}
				System.out.print("Möchtest du nochmal raten? ");
				Boolean again = scanner.nextBoolean();
				if (again) {
					wrong = true;
				} else {
					System.out.println("Ok. Bye");
					break;
				}
			}
		}

	}
}
