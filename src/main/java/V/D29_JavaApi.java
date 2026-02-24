package V;

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

import model.Person;

public class D29_JavaApi {

	public static void main(String[] args) throws FileNotFoundException { // BONUSPUNKTE
		ArrayList<Person> persons = new ArrayList<>();

		File file = new File("src/main/java/resources/persons.txt"); // muss zuhause nochmal richtig gemacht werden
		// Klausur -> File als parameter -> ^muss in der Klausur nicht deklariert werden
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine(); // scanne nach file"
			String[] tokens = line.split(";"); // neue info nach jeden ";"

			String name = tokens[0];
			char gender = tokens[1].charAt(0);
			int year = Integer.parseInt(tokens[2]); // wandle zeichenkette in int
			int month = Integer.parseInt(tokens[3]);
			int day = Integer.parseInt(tokens[4]);
			LocalDate birthdate = LocalDate.of(year, month, day);

			Person person = new Person(name, gender, birthdate);
			persons.add(person);
		}

		System.out.println(persons);

		scanner.close();

	}

}
