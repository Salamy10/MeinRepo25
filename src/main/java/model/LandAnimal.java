package model;

import java.time.LocalDate;

public class LandAnimal extends Animal { // siehe "WaterAnimal" for basic descriptions

	private final int numberOfLegs;

	public LandAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate, double weightInKg,
			int numberOfLegs) {
		super(type, color, isCarnivore, birthdate, weightInKg);
		this.numberOfLegs = numberOfLegs;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void run() {
		System.out.println("renn, renn");
	}

	public void move() {
		super.move();
		run();
	}

	@Override
	public String toString() { // wandelt Objekt in eine Zeichenkette um
		return "Animal [type=" + getType() + ", color=" + getColor() + ", weightinKg=" + getWeightInKg()
				+ ", isCarnivore=" + isCarnivore() + ", birthdate=" + getBirthdate() + ", numberOfLegs= " + numberOfLegs
				+ "]";
		// Oberklassen-Attribute -> get Methoden + eigene Attribute
	}

}
