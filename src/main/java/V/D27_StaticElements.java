package V;

import model.TableLight;

public class D27_StaticElements {

	public static void main(String[] args) {	
		int numberOfTableLights = TableLight.getNumberOfTableLights();	//Methode zähle Lampen
		System.out.println(numberOfTableLights);	//Ausgabe Menge der Lapen Hier: "0"
		
		TableLight light1 = new TableLight();	//Lampe 1 Erstellt
		light1.switchOn();
		TableLight light2 = new TableLight();	//Lampe 2 Erstellt
		light2.plugIn();
		TableLight light3 = new TableLight();	//Lampe 3 Erstellt
		light3.plugIn();
		
		numberOfTableLights = TableLight.getNumberOfTableLights();	//Methode zähle Lampen
		System.out.println(numberOfTableLights);	//Ausgabe Menge der Lapen Hier: "3"
	}

}
