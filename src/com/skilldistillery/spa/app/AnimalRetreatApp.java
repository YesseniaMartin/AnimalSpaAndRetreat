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
		System.out.println("Attendant: " + retreat.getAttendant().getName());

		retreat.listAnimal();

		System.out.println();

		Dragon dragon = new Dragon("Amaree");
		System.out.println("Hello I'm " + dragon.getName() + " the Dragon.");
		dragon.makeNoise();
		dragon.eat(122);
		System.out.println();

		Penguin penguin = new Penguin("Kiyan");
		System.out.println("Hello I'm " + penguin.getName() + " the Penguin.");
		penguin.makeNoise();
		penguin.eat(15);
		System.out.println();

		Eagle eagle = new Eagle("Frank");
		System.out.println("Hello I'm " + eagle.getName() + " the Eagle.");
		eagle.makeNoise();
		eagle.eat(50);
		System.out.println();
		

	}

}
