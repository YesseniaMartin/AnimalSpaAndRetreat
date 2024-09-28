package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Penguin extends Animal {
	private String noise = "Whistlinggggg";
	
//	methods
	public void makeRounds() {
		
	}
	
	public Penguin() {
		super();
	}
	
	public Penguin(String name) {
		super(name);
	}
	@Override
	public void eat(int quantity) {
		System.out.println("I'm enjoy " + quantity + "  fish a day.  ");
		super.eat(quantity);
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("High-pitched sounds " + noise);
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
		Penguin other = (Penguin) obj;
		return Objects.equals(noise, other.noise);
	}

	@Override
	public String toString() {
		return "Penguin [noise=" + noise + ", quantity=" + quantity + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
