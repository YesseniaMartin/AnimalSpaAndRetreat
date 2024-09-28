package com.skilldistillery.spa.entities;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(name, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(name, other.name) && quantity == other.quantity;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", quantity=" + quantity + "]";
	}
}
