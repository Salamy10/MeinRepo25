package practice.kartenausteiler;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private final List<Card> cards;

	Player() {
		cards = new ArrayList<>();
	}

	public List<Card> getCards() {
		return cards;
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public Card getCardWithHighestValue() {

		Card highcard = cards.get(0);
		for (Card c : cards) {
			if (highcard.getValue() < c.getValue()) {
				highcard = c;
			}
		}

		return highcard;
	}

	public List<Card> getCardsByColour(String colour) {
		List<Card> ColourCards = new ArrayList<>();
		for (Card c : cards) {
			if (c.getColour().equals(colour)) {
				ColourCards.add(c);
			}
		}
		return ColourCards;
	}

}
