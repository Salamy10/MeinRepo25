package V;
public class D04_DataObjects {
	
	//konstante
	public final static double PI = 3.14159265359;
	
	public static void main(String[] args) {
		
		System.out.println(D04_DataObjects.PI);	//([klassenname].[variable])
		
		//deklaration
		int age;
		String name, firstName, familyName, firstNameAndFamilyName; //gleiche Datentypen können in einer Zeile zusammen deklariert werden		
		double sizeInM;
		boolean isMale;
		
		//initialisierungen
		age = 20;
		firstName = "Samuel";
		familyName = "Bürkle";
		sizeInM = 1.87;
		isMale = true;
		
		//ausgabe		
		System.out.println(age);
		System.out.println(firstName);
		System.out.println(familyName);
		System.out.println(sizeInM);
		System.out.println(isMale);
		
		//Veränderliche Datenobjekte
		age = 22;
		System.out.println("age: " + age);
		
		//Unveränderliche Datenobjekte
//		final String text0 = "Java";	//"final" signalisiert unveränderlichen wert
//		text = "Python";	//würde einen Fehler angeben
	
//Sichtbarkeit von Datenobjekten
		//X = 8;
		//i = 7; // wird nicht funktioniereb -> DO noch nicht festegelegt
}
	public static void doSomething(int x){

		int i = 5;
		x = 7;
		System.out.println(i + x); //funktioniert, da daten in methode deklariert
		
	}

}
