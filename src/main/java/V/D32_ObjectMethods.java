package V;

import java.time.LocalDate;

import model.Person;

public class D32_ObjectMethods {

	public static void main(String[] args) {

		Person person1 = new Person("Hans", 'm', LocalDate.of(2000, 5, 7));
		Person person2 = new Person("Peter", 'm', LocalDate.of(2000, 12, 31));
		Person person3 = new Person("Peter", 'm', LocalDate.of(2000, 12, 31));

		/* toString */
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());

		/* equals */
		if (person2 == person3) { // unterschiedliche Adressen
			System.out.println("person2 == person 3");
		} else {
			System.out.println("nuh uuh");
		}

		if (person2.equals(person3)) { // ohne Person.equals - ist nicht dasselbe, nur das gleiche
										// mit Person.equals - Attribute alle gleich -> A=B
			System.out.println("person2.equals(person3)");
		} else {
			System.out.println("nuh uuhr");
		}

		/* hashcode */ // programmieren 2 ==> nicht Klausurrelevant
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
	}

}
