package com.skilldistillery.spa.entities;



public class AnimalRetreat {
	// fields
	private Attendant attendant;
	Animal[] roomsArr = new Animal[10];

	// Constructors
	public AnimalRetreat() {
	}
	
	// Methods
	public AnimalRetreat(String attendantName) {
		setAttendant(new Attendant(attendantName));
		
	}

	public void Attendant(Attendant attendant) {

	}

	public Attendant getAttendant() {
		return attendant;
	}

	public Animal[] createRooms() {
		return new Animal[10];
	}
	public Animal [] createRooms(String name, int foodAmount) {
		
		Animal[] rooms = new Animal[10];
		rooms[0] = new Dragon("Amaree");
		rooms[1] = new Penguin("Kiyan");
		rooms[2] = new Eagle("Frank");
		
		for (int i = 0; i < rooms.length; i++) {
	        if (rooms[i] != null) {
	            System.out.println("I will feed " + rooms[i].getName() + ".");
	            rooms[i].eat(foodAmount);
	        } else {
	            System.out.println("Room " + (i + 1) + " is empty.");
	        }
	    }
	    System.out.println("Rounds completed.");
	    return rooms;
	}
	

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	
	
	
	

}