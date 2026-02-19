package V;

import utility.StringArrayHelper;
import java.util.Arrays;

import model.StringArray;

public class D19_Methods {

	public static void main(String[] args) {

		/* Prozeduale Lösung (Daten und Routinen getrennt) */
		String[] names = new String[2];

		StringArrayHelper.print(names);
		names = StringArrayHelper.add(names, "Hans");
		StringArrayHelper.print(names);
		names = StringArrayHelper.add(names, "Lisa");
		StringArrayHelper.print(names);
		names = StringArrayHelper.add(names, "Peter");
		StringArrayHelper.print(names);

		System.out.println(StringArrayHelper.size(names));

		
		
		/* Objektorientierte Lösung (Daten und Routinen verbunden) */
		StringArray names2 = new StringArray();
		
		names2.print();
		names2.add("Hans");
		names2.print();
		names2.add("Peter");
		names2.print();
		names2.add("Lisa");
		names2.print();
		System.out.println(names2.size());
	}

}

