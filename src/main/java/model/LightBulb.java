package model;

public class LightBulb {

	private final String color;

	public LightBulb(String color) {
		this.color = color; // selbst-referenz
	}

	public String getColor() {
		return color;
	}

	@Override	//+1 punkt klausur
	public String toString() {
		return "LightBulb [color=" + color + "]";
	} // gehört zum guten ton die Klasse richtig abzugeben

}
