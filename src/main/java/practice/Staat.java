package practice;

public class Staat {
	private String name;
	private int anzahlSoldaten;
	private int anzahlFlugzeuge;

	public Staat(String name, int anzahlSoldaten, int anzahlFlugzeuge) {
		this.name = name;
		this.anzahlSoldaten = anzahlSoldaten;
		this.anzahlFlugzeuge = anzahlFlugzeuge;
	}

	public void defend(int angriffsStaerke) {
		if (angriffsStaerke <= anzahlSoldaten) {
			anzahlSoldaten -= angriffsStaerke;
		} else {
			System.out.println("Zu wenig Truppen auf dem Feld");
		}
	}

	public void surrender() {
		anzahlSoldaten = 0;
		anzahlFlugzeuge = 0;
	}

	public void printStatus() {
		System.out.println(name + " hat an der Zahl: " + "Soldaten: " + anzahlSoldaten + ", Flugzeuge: " + anzahlFlugzeuge + "\n");
	}

	public String getName() {
		return name;
	}

	public int getAnzahlSoldaten() {
		return anzahlSoldaten;
	}

	public int getAnzahlFlugzeuge() {
		return anzahlFlugzeuge;
	}

}
