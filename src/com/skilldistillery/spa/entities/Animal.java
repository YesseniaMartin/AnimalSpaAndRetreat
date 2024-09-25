package com.skilldistillery.spa.entities;

//kind of animal
public abstract class Animal {
	private String name;
	public int quantity;
	
//	methods being used
	public Animal() {

	}

//	this make them know the name of the animal
	public Animal(String name) {
		this.name =  name;
		
	}

//	this is how my animal eats
	
	public void eat(int quantity) {
		System.out.println("Don't bother me, when I'm eating " + quantity + " lbs of food.");
	}
	
//	the animal has noise
	public void makeNoise() {
		System.out.println("I am Animal, growling with delight ");
	}

//	getters and setters for my private class
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
