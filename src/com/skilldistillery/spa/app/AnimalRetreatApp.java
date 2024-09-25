package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.Animal;
import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Attendant;
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
		System.out.println(retreat.getAttendant().getName());
		Attendant rounds = new Attendant();
		rounds.makeRounds();
		System.out.println();
		System.out.println();
		
		
		Dragon dragon = new Dragon("Amaree");
		System.out.println("Hello I'm " + dragon.getName() + " the Dragon.");
		dragon.eat(122);
		dragon.makeNoise();
		System.out.println();
		
		Penguin penguin = new Penguin("Kiyan");
		System.out.println("Hello I'm " + penguin.getName() + " the Penguin.");
		penguin.eat(15);
		penguin.makeNoise();
		System.out.println();

		
		Eagle eagle = new Eagle("Frank");
		System.out.println("Hello I'm " + eagle.getName() + " the Eagle.");
		eagle.eat(50);
		eagle.makeNoise();

	}

}
