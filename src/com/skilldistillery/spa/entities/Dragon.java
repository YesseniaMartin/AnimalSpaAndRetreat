package com.skilldistillery.spa.entities;

public class Dragon extends Animal {
	private String noise = "Roaaaaaaring";
	
//	methods 
	
	public Dragon() {
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

}
