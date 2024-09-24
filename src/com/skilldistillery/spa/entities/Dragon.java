package com.skilldistillery.spa.entities;

public class Dragon extends Animal {
	private String noise = "Roaaaaaaring";
	public int eat;
	
//	methods 
	
	public Dragon(int eat) {
		super();
		
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
		System.out.println("Breathing fire with a more playful sound " + noise);
	}
	
	@Override
	public void eat(int quantity) {
		System.out.println("I enjoying my " + eat + " of Livestock");
		super.eat(quantity);
	}

}
