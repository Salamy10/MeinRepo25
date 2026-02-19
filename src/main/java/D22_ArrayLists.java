package P1;

import java.util.ArrayList;

public class D22_ArrayLists {	//EXTREM KLAUSURRELEVANT

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		
		/* Elemente anfügen */
		names.add("Hans");
		names.add("Peter");
		
		/* Element einfügen */
		names.add(1, "Lisa");
		names.add(1, "Max");
		names.add(2, "Anna");
		
		/* Elemente löschen */
		names.remove(0);		//-Hans
		names.remove("Anna");	//- erste Instanz des Wertes
		
		/* Elemente auslesen */
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
	
		/* Elemente ausgeben */
		System.out.println(names);
		

	}

}
