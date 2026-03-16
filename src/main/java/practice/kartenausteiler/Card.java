package practice.kartenausteiler;

public class Card {

	private final String colour;
	private final int value;

	public Card(String colour, int value) {
		this.colour = colour;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getColour() {
		return colour;
	}

}
