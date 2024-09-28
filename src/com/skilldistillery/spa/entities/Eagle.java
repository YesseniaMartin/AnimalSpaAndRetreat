package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Eagle extends Animal{
	private String noise = "Whistleeees";
	
// methods
	
	public Eagle() {
		super();
	}
	
	public Eagle(String name) {
		super(name);
	}
	
	public void makeRounds() {
		
	}
	
	@Override
	public void eat(int quantity) {
		System.out.println("I enjoy " + quantity + " of fish, squirrels, birds");
		super.eat(quantity);
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Produce sharp barking sound " + noise);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(noise);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eagle other = (Eagle) obj;
		return Objects.equals(noise, other.noise);
	}

	@Override
	public String toString() {
		return "Eagle [noise=" + noise + ", quantity=" + quantity + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
