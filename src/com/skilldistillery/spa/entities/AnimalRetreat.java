package com.skilldistillery.spa.entities;
import com.skilldistillery.spa.entities.Animal;



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

	public AnimalRetreat[] createRooms() {
		return new AnimalRetreat[10];
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	

	public void displayRoomInfo() {
		System.out.println("There are " + roomsArr.length + " rooms in the spa.");
		for (Animal room : roomsArr) {
			if (room != null) {
			System.out.println("- " + room.getName());
			} else {
				System.out.println("- This room is empty.");
			}
		}
	}
	
	

}