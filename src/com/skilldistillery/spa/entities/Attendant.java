package com.skilldistillery.spa.entities;

public class Attendant {
// feeds the animal
//
	private String name;
	public Animal animal;

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

	public void makeRounds(Animal[] rooms, int foodAmount) {
		System.out.println("Sara is making rounds ");
		if (rooms == null) {
	        System.out.println("No rooms to check.");
	        return;
		}
	}
}
