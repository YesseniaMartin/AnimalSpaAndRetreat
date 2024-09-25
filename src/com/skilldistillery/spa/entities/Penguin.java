package com.skilldistillery.spa.entities;

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

}
