package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Dragon;
import com.skilldistillery.spa.entities.Eagle;
import com.skilldistillery.spa.entities.Penguin;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		app.run();
	}
	
	
	public void run() {
		
		AnimalRetreat retreat = new AnimalRetreat("Sara the Attendant");
		System.out.println(retreat);
		
		Dragon dragon = new Dragon("Amaree");
		System.out.println("Hello I'm " + dragon.getName() + " the Dragon.");
		
		Dragon dragonEats = new Dragon();
		dragonEats.eat(122);
		
		Dragon dragonNoise = new Dragon();
		dragonNoise.makeNoise();
		
		Penguin penguin = new Penguin("Kiyan");
		System.out.println("Hello I'm " + penguin.getName() + " the Penguin.");
		
		Penguin penguinEats = new Penguin();
		penguinEats.eat(15);
		
		Penguin penguinNoise = new Penguin();
		penguinNoise.makeNoise();
		
		
		Eagle eagle = new Eagle("Frank");
		System.out.println("Hello I'm " + eagle.getName() + " the Eagle.");
		
		Eagle eaglesEats = new Eagle();
		eaglesEats.eat(50);
		
		Eagle eagleNoise = new Eagle();
		eagleNoise.makeNoise();
				
		
		

	}

}
