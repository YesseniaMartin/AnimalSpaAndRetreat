package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Dragon extends Animal {
	private String noise = "Roaaaaaaring";
	
//	methods 
	
	public Dragon() {
		super();
		
	}
	
	public void makeRounds() {
		
	}
	
	public Dragon(String name) {
		super(name);
	}
	
	public Dragon(String name, String noise) {
		super(name);
		this.noise = noise + " " + noise;
	}
	
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("Breathing fire " + noise);
	}
	
	@Override
	public void eat(int quantity) {
		System.out.println("I enjoying about " + quantity + " of Livestock a day so.... ");
		super.eat(quantity);
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
		Dragon other = (Dragon) obj;
		return Objects.equals(noise, other.noise);
	}

	@Override
	public String toString() {
		return "Dragon [noise=" + noise + ", quantity=" + quantity + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
