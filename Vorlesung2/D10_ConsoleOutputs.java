package P1;

import java.util.Locale;

public class D10_ConsoleOutputs {

	public static void main(String[] args) {
		
		//print- und println-Methoden
		System.out.println("Text 1");
		System.out.print("Text 2");	//ohne ln -> kein Zeilenumbruch
		System.out.println("Text 3");
		System.out.println(true);
		System.out.println(44);
		
		System.out.println();	//ohne inhalt -> Zeilenumbruch
		
		//printf-Methoden
		//Aufbau einer Formatierungs-Regel: %[flags][width][.precision]conversion-character
		System.out.printf("");		
		///////////*nicht klausurreevant !!!aber Extrapunkte durch Anwendung	//f = formaierung -> reine optik*/////////

		//string formatierungen	(conversion-character "s")
		String text = "Hallo";
		String name = "Hans";
		System.out.printf("%s %s%n", text, name);	
		System.out.printf("%S %S%n", text, name);	//Großbuchstaben-Formatierung
		System.out.printf("%20s %s%n", text, name);	//Festlegen der Ausgabenlänge
		System.out.printf("%-20s %s%n", text, name);	//Linksbündige Ausgabe
		
		System.out.println();
		
		//Dezimalzahlen-Formatierung (conversion-character d)
		System.out.println(1_000_000_000);
		System.out.printf("%,d%n", 1_000_000_000);	//Festlegen des Tausenderkennzeichens: komma sagt standarteinstellung
		System.out.printf(Locale.JAPAN, "%,d%n", 1_000_000_000);	//Maybe Klausur->Extrapunkte
		
		System.out.println();
		
		//Gleitkommazahlen-Formatierungen (conversion-character f)
		System.out.printf("%.2f", 3.1415);	// "." gibt nachkommastellen mit "2" an; +  er rundet
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//tabelle
		System.out.printf("%-10s %s%n", "Name", "NP");
		System.out.println("--------------");
		System.out.printf("%-10s %s%n", "Peter", "3");
		System.out.printf("%-10s %s%n", "Luis", "7");
		System.out.printf("%-10s %s%n", "Heidi", "1");
		System.out.printf("%-10s %s%n", "Ahmed", "13");
		System.out.printf("%-10s %s%n", "leckEi", "15");
		
	}

}
