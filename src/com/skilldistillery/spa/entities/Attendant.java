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
	
	public void makeRounds() {
		
		Animal dragon = new Dragon();
		Animal penguin = new Penguin();
		Animal eagle = new Eagle();
		
		Animal[] roomArr = {dragon,penguin,eagle};
		roomArr[0] = dragon;
		roomArr[1] = penguin;
		roomArr[2] = eagle;
		
		System.out.println(roomArr[0].getName());
		System.out.println(roomArr[1].getName());
		System.out.println(roomArr[2].getName());
	}
	

}
