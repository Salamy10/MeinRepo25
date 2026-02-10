package V;

import java.util.Scanner;

public class D15_Loops {

	public static void main(String[] args) {

		/* while-Schleife (kopfgesteuerte Schleife) */
		System.out.println("while: ");
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		// "Achtung danach: i=11"
		// diese wird nicht durchlaufen, sollte der anfangswert den Kriterium
		// entsprechen

		System.out.println();

		/* do-while-schleife (fußgesteuerte Schleife) */
		System.out.println("do-while: ");
		int x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);
		// "Achtung danach: X=11"
		// diese wird mindestens einmal durchlaufen, auch wen der anfangswert den
		// Kriterium entspricht

		System.out.println();

		/* for-Schleife (Zählschleife) */
		System.out.println("for: ");

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		// "Achtung danach: a=11"

		System.out.println();

		/* Endlosschleife + Schleufensteuerung mit break und continue*/
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Schleife beenden (true oder false)?: ");
			boolean answer = scanner.nextBoolean();
			if (answer == true) {
				break;
			}
			System.out.print("Uhrzeit ausgeben (true oder false)?: ");
			answer = scanner.nextBoolean();
			if (answer == false) {
				continue;
			}
			System.out.println(System.currentTimeMillis());

		}
	}

}
