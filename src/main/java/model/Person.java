package model;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private char gender;
	private final LocalDate birthdate;	//oh nooo... ist statisches objekt
	
	public Person(String name, char gender, LocalDate birthdate) {	//Statisches objekt implementieren
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", birthdate=" + birthdate;
	}

}
