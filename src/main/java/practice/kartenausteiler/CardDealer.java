package practice.kartenausteiler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDealer {

	private final List<Card> deck;
	private final Player player1;
	private final Player player2;

	public CardDealer(List<Card> deck, Player player1, Player player2) {
		this.deck = new ArrayList<>();
		this.player1 = player1;
		this.player2 = player2;
	}

	public void dealCards(int amount) {
		Random r = new Random();

		for (int i = 0; i < amount; i++) {
			int index1 = r.nextInt(deck.size());
			player1.addCard(deck.get(index1));
			deck.remove(index1);
			int index2 = r.nextInt(deck.size());
			player2.addCard(deck.get(index2));
			deck.remove(index2);
		}

	}

	public List<Card> deck() {
		return deck;
	}

	public Player player1() {
		return player1;
	}

	public Player player2() {
		return player2;
	}

}
