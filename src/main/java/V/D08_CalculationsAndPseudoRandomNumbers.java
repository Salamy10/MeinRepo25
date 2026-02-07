package V;

import java.util.Random;

public class D08_CalculationsAndPseudoRandomNumbers {
	
	public static void main(String[] args) {
		
		//mathematische Berechnungen
		double result = Math.sqrt(64);
		
		System.out.println("result: " + result);
		
		//Pseudozufallszahlen
		int randomNumber;
		
		randomNumber = (int) (Math.random() * 100) + 1;	//in int, random nummer, von 0 - 99 (100 zahlen), +1 für 99 -> 100
		System.out.println("random Number: " + randomNumber);
		
		//Klasse "Random" mit erstelltem Objekt
		Random random = new Random();
		randomNumber = random.nextInt(101); //1 inklusive, 101 exklusive
		System.out.println("random Number 2: " + randomNumber);
	}

}
