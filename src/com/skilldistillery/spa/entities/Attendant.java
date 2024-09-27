package com.skilldistillery.spa.entities;

public class Attendant extends AnimalRetreat{
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
		
		if (rooms == null) {
	        System.out.println("No rooms to check.");
	        return;
		}
		System.out.println("Sara is making rounds ");
		for (int i = 0; i < rooms.length; i++) {
	        if (rooms[i] != null) {
	            System.out.println("I will feed " + rooms[i].getName() + ".");
	            rooms[i].eat(foodAmount);
	        } else {
	            System.out.println("Room " + (i + 1) + " is empty.");
	        }
	    }
	    System.out.println("Rounds completed.");
	}
}
