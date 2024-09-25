package com.skilldistillery.spa.entities;

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

}
