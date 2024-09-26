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

	public void makeRounds(AnimalRetreat[] rooms, int foodAmount) {
		System.out.println("Sara is making rounds ");
		AnimalRetreat[] roomsArr = new AnimalRetreat[10];
		
		System.out.println("There are " + roomsArr.length + " rooms in the spa.");
		for (AnimalRetreat room : roomsArr) {
			if (roomsArr != null) {
				System.out.println("Checking " + room + ".");
			} else {
				System.out.println("Room is empty.");
			}
		}
		System.out.println("Rounds completed.");
	}

	public Animal[] createRooms() {

		AnimalRetreat[] roomsArr = new AnimalRetreat[10];
		for (int i = 0; i < roomsArr.length; i++) {
			switch (i % 3) {
			case 0:
				roomsArr[i] = new AnimalRetreat("In room " + (i + 1));
				break;
			case 1:
				roomsArr[i] = new AnimalRetreat("In room " + (i + 1));
				break;
			case 2:
				roomsArr[i] = new AnimalRetreat("In room " + (i + 1));
				break;
			}
			
		}
		return new Animal[10];
	}
	
}
