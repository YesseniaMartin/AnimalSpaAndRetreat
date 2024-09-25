package com.skilldistillery.spa.entities;

public class Eagle extends Animal{
	private String noise = "Whistleeees";
	
// methods
	
	public Eagle() {
		super();
	}
	
	public Eagle(String name) {
		super(name);
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

}
