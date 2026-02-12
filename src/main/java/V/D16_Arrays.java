package V;

import java.util.Arrays;
import java.util.Random;

public class D16_Arrays {

	public static void main(String[] args) {
		Random random = new Random();

		/* Deklaration & Initialisierung */
		int[] numbers = new int[100]; // {2, 3, 5, 8, ...};
		String[] names = { "Hans", "Peter", "Lisa" }; // Werte zugewiesen bei der Initialisierung //new String [3]

		/* Zugriff auf einzelne Feld-Elemente */
		numbers[50] = 3; // 51. Element hat jetzt den Wert 3
		numbers[0] = 7;
		numbers[numbers.length - 1] = 5;
		System.out.println("numbers[0]: " + numbers[0]);
		System.out.println("numbers[50]: " + numbers[50]);
		System.out.println("numbers[99]: " + numbers[99]);
		System.out.println("numbers[6]: " + numbers[6]); // nicht initialisierte Schublade

		System.out.println("Initialisierter Name: " + names[1]);
		names[1] = "Petra";
		System.out.println("Neu zugewiesener Name: " + names[1]);

		/* Random name */
		int randomNumber = random.nextInt(names.length);
		System.out.println("random name: " + names[randomNumber]);

		/* Zugriff auf mehrere Felder */
		int x = 0;

		while (x < numbers.length) {
			numbers[x] = random.nextInt(9 + 1);		//gi den Array-Elementen einen random wert
			x++;
		}

		/* Ausgabe von Feldelementen */
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			System.out.print(i + ": " + number + "   ||   ");
		}

		/* Ausgabe des ganzen Array-Inhalts */
		System.out.println(names); // nonsense weil ganzes Array
		System.out.println(Arrays.toString(names)); // Konvert to string, Show whole

	}

}
