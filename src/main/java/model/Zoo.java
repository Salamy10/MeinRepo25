package model;

import java.util.ArrayList;

/**
 * Zoo
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class Zoo {

	private final String name;
	private final ArrayList<Animal> animals;

	public Zoo(String name) { // Constructor
		this.name = name;
		animals = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	@Override
	public String toString() { // wandelt Objekt in eine Zeichenkette um
		return "Zoo [name=" + name + "animals=" + animals + "]";
	}

	/* Prüfungsrelevant */
	public ArrayList<WaterAnimal> getWaterAnimals() { // methode zu rückgabe der WasserTiere - durch eine Liste aller Objekte der Klasse WaterAnimal
		ArrayList<WaterAnimal> waterAnimals = new ArrayList<>();

		for (Animal a : animals) { // für jedes Tier der Tierliste...
			/*bis Java16*/
			if(a instanceof WaterAnimal) {	//wenn das element ein teil der Klasse WaterAnimal ist...
				WaterAnimal waterAnimal = (WaterAnimal) a;	//Downcast
				waterAnimals.add(waterAnimal);				
			}
			
			/* seit Java16 */
//			if(a instanceof LandAnimal landAnimal) {	//Downcast
//				System.out.println(landAnimal + "Du bist kein Wassertier");	
//			}
		}
		return waterAnimals;
	}

}
