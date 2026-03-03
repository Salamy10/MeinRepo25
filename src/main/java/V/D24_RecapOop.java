package V;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Animal;
import model.Color;
import model.LandAnimal;
import model.WaterAnimal;
import model.Zoo;

public class D24_RecapOop {

   public static void main(String[] args) {
      Zoo zoo = new Zoo("Ravensburger Tierpart");
      

      Animal animal1 = new LandAnimal("Pferd", Color.BLACK, false, LocalDate.now(), 100, 4);	//upcast -> haben referenz der Unterklasse und setzen Attribute der Oberklasse
      Animal animal2 = new LandAnimal("Tiger", Color.ORANGE, true, LocalDate.of(2020, 8, 16), 250, 4);	//upcast
      Animal animal3 = new WaterAnimal("Clown-Fish", Color.ORANGE, false, LocalDate.of(2018, 12, 3), 0.2, true);	//upcast

      zoo.addAnimal(animal1);	//fügt tiere zur ArrayList aus Zoo-Klasse hinzu
      zoo.addAnimal(animal2);	//"
      zoo.addAnimal(animal3);	//"

      animal3.eat();	
      animal2.move();	//Dynamische Polymorphie (Wissen noch nicht welche implementeirung aufgerufen wird)
      animal2.move();	//Dynamische Polymorphie
      animal3.move();	//Dynamische Polymorphie

      ArrayList<Animal> animals = zoo.getAnimals();	//Methode der Rückgabe der Zoo-ArrayList
      
      for (Animal animal : animals) {	//"für jedes Tier in Tierliste gib aus: "
         System.out.println(animal.toString());		//Dynamische Polymorphie
      }
      
      System.out.println(zoo);
      
      System.out.println();
      
      ArrayList<WaterAnimal> waterAnimals = zoo.getWaterAnimals();
      System.out.println(waterAnimals);
   }

}
