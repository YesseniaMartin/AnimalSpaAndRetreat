package com.skilldistillery.spa.entities;

public class AnimalRetreat {
	
	private Attendant attendant;
	
	public void Attendant(Attendant attendant) {
		
	}
	public void makeRounds() {
		
	}
	public AnimalRetreat() {
		
	}
	
	public AnimalRetreat(String attendantName) {
		setAttendant(new Attendant(attendantName));
	}

	public Attendant getAttendant() {
		return attendant;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
	@Override
	public String toString() {
		return "AnimalRetreat [attendant=" + attendant + "]";
	}
	
	
}
