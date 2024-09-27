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

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	
	
	
	

}