package model;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

	private String name;
	private char gender;
	private final LocalDate birthdate;

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private char getGender() {
		return gender;
	}

	private void setGender(char gender) {
		this.gender = gender;
	}

	private LocalDate getBirthdate() {
		return birthdate;
	}

	public Person(String name, char gender, LocalDate birthdate) {
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthdate, gender, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(birthdate, other.birthdate) && gender == other.gender && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", birthdate=" + birthdate + "]";
	}

	/* oben generiert durch Source -> generate shit || unten selbst geschrieben */

//	public Person(String name, char gender, LocalDate birthdate) {
//		this.name = name;
//		this.gender = gender;
//		this.birthdate = birthdate;
//	}
//
//	/* 3 Methoden in der sauberen OO */
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", gender=" + gender + ", birthdate=" + birthdate + "]";
//	}
//
//	/* folgende 2 nicht Prüfungsrelevant */
//	public boolean equals(Object obj) {
//		Person otherPerson = (Person) obj; // downcast
//		return name.equals(otherPerson.name) && gender == otherPerson.gender && birthdate.equals(otherPerson.birthdate);
//		// true wenn genannte Elemente alle true
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, gender, birthdate);
//	}

}
