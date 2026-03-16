package practice.kartenausteiler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CardsReader {

	public List<Card> getCards(File file) throws FileNotFoundException {
		Scanner sc = new Scanner(file);
		List<Card> cards = new ArrayList<>();

		while (sc.hasNextLine()) {
			String line = sc.next();
			String[] tokens = line.split(";");
			String colour = tokens[0];
			int value = Integer.valueOf(tokens[1]);
			Card card = new Card(colour, value);
			cards.add(card);
		}

		sc.close();
		return cards;

	}

}
