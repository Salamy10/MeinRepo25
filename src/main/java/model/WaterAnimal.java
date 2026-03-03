package model;

import java.time.LocalDate;

public class WaterAnimal extends Animal { // Vererbung - hab alle methoden & attribute, die animal auch hat

	private final boolean isSaltwater;	//Klasseneigenes Attribut

	public WaterAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate, double weightInKg,
			boolean isSaltwater) {
		super(type, color, isCarnivore, birthdate, weightInKg); // "Super" gewährt zugriff auf die Superklasse
		// constructor der Superklasse wird aufgerufen
		this.isSaltwater = isSaltwater; // neue Attribute dieser Klasse
	} // "constructer der Superklasse kümmert sich um diese attribute"

	public boolean isSaltwater() {
		return isSaltwater;
	}

	public void swim() {
		System.out.println("schwimm, schwimm");
	}

	@Override
	public void move() { // vererbte methode "move" übreschreiben
		// entweder alles neu schreiben/wiederholen oder...
		super.move(); // methode der Oberklasse wird übrenommen
		swim(); // tier schwimmt bei bewegung
	}

	@Override
	public String toString() { // wandelt Objekt in eine Zeichenkette um
		return "Animal [type=" + getType() + ", color=" + getColor() + ", weightinKg=" + getWeightInKg()
				+ ", isCarnivore=" + isCarnivore() + ", birthdate=" + getBirthdate() + ", isSaltwater= "
				+ isSaltwater + "]";
		//Oberklassen-Attribute -> get Methoden + eigene Attribute
	}

}
