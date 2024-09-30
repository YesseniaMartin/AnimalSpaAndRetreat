package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Attendant {
// feeds the animal
//
	private String name;
	private Animal animal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attendant(String name) {
		this.name = name;
	}

	public Attendant() {

	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void makeRounds(Animal[] animals, int foodAmount) {
		System.out.println("Sara is making rounds ");
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println("I will feed " + animals[i].getName());
				animals[i].eat(foodAmount);
			} else if (animals[i] == null) {
				System.out.println("No rooms to check.");
			}
		}
		System.out.println("All occupants have been fed, have a great day!");
		System.out.println("Rounds completed. The attendant is done for the day");

	}
	

	@Override
	public int hashCode() {
		return Objects.hash(animal, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendant other = (Attendant) obj;
		return Objects.equals(animal, other.animal) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Attendant [name=" + name + ", animal=" + animal + ", getName()=" + getName() + ", getAnimal()="
				+ getAnimal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
