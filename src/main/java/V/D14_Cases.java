package P1;

import java.util.Scanner;

public class D14_Cases {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte gib \"r/R\", \"g/G\" oder \"b/B\" ein: ");

		char color = scanner.next().charAt(0);

		String colorText;
		if (color == 'r' || color == 'R') {

			colorText = "rot";

		} else if (color == 'g' || color == 'G') {
			colorText = "grün";
		} else if (color == 'b' || color == 'B') {
			colorText = "blau";
		} else {
			colorText = "och nööö";
		}
		System.out.println(colorText);

		/*kurzschreibweise*/
//		System.out.println((color == 'r')? "rot" : (color == 'g')? "grün" : (color == 'b')? "blau" : "och nöö");

		/*gut wenn man mehrere Fälle hat die das gleiche Ergebnis bewirken*/
		switch (color) {
		case 'r':
		case 'R':
			colorText = "rot";
			break;
		case 'g':
		case 'G':
			colorText = "grün";
			break;
		case 'b':
		case 'B':
			colorText = "blau";
			break;
		default:
			colorText = "och nööö";
			break;
		}
		System.out.println(colorText);
		// case prüft immer auf gleichheit (nicht <, >)
		// aber leider immer noch nicht Elegant

		/* elegantere Lösung (erst ab Java11 (HS hat Java8))*/
		switch (color) {
		case 'r', 'R'-> colorText = "rot";
		case 'g', 'G'-> colorText = "grün"; 
		case 'b', 'B'-> colorText = "blau"; 
		default 	-> colorText = "och nööö";	//syntax fehler unter java11
		};
		System.out.println(colorText);
	}

}
