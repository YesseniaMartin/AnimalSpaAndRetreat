package com.skilldistillery.spa.entities;

import java.util.Arrays;

public class AnimalRetreat {
	// fields
	private Attendant attendant;
	Animal[] animalRooms = new Animal[10];

	// Constructors

	public AnimalRetreat() {
	}

	public AnimalRetreat(String attendantName) {
		setAttendant(new Attendant(attendantName));

	}

	// Methods

	public void listAnimal() {
		System.out.println("Listing animals in the retreat:");

		for (int i = 0; i < animalRooms.length; i++) {

			if (animalRooms[i] != null) {
				System.out.println(animalRooms[i].getName() + " is in the room");
			} else if (animalRooms[i] == null) {
				System.out.println("This room is empty");
			}

		}

	}

	public void addAnimal(Animal animal) {
		for (int i = 0; i < animalRooms.length; i++) {
			if (animalRooms[i] == null) {
				animalRooms[i] = animal;
				System.out.println("Make yourself at home, " + animal.getName());
			} else if (animalRooms[i] != null) {
				System.out.println("No room at the retreat and spa, try again tomorrow.");
			}
		}
	}

	public void startAttendantRounds(Animal[] animals, int foodAmount) {
		getAttendant().makeRounds(animals, foodAmount);
	}

	public Attendant getAttendant() {
		return attendant;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	

	@Override
	public String toString() {
		return "AnimalRetreat [attendant=" + attendant + ", animalRooms=" + Arrays.toString(animalRooms)
				+ ", getAttendant()=" + getAttendant() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}