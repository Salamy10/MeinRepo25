package Vorlesung2;
public class D06_Strings {
	
	public static void main(String[] args) {
		
		//Wichtige Methoden
		String text = "Hello World";
		int length = text.length();
		char characterIndex7 = text.charAt(7);
		char firstCharacter = text.charAt(0);
		char lastCharacter = text.charAt(text.length() -1);
		
		System.out.println("length: " + length);
		System.out.println("characterIndex: " +  characterIndex7);
		System.out.println("firstCharacter: " + firstCharacter);
		System.out.println("lastCharacter: " + lastCharacter);
		
		//System.out.println(text.charAt(11));	//Programmabruch -> java zählt von 0 bis 10
		
		
		//Zeichenketten-Konkatenation
		String columns = "id";
		String table = "flight";
		String condition = "city = \"Friedrichshafen\"";	// \"  fügt " ein ohne die Zeichenfolge zu brechen
		String sqlQuery = "SELECT " + columns + "\nFROM " + table + "\nWHERE " + condition + ";";	// \n für zeilenumbruch
		
		System.out.println(sqlQuery);
	}

}
