package com.skilldistillery.spa.entities;

public abstract class Animal {
	private String name;
	public int quantity;

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;

	}

	public void eat(int quantity) {
		System.out.println("Don't bother me, when I'm eating " + quantity + " lbs of food.");
	}

	public void makeNoise() {
		System.out.println("I am Animal, growling with delight ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", quantity=" + quantity + "]";
	}
}
