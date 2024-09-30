package com.skilldistillery.spa.app;

import java.util.Scanner;

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
		Scanner menu = new Scanner(System.in);
		AnimalRetreat retreat = new AnimalRetreat("Sara the Attendant");
		retreat.introduction();
		System.out.println("Attendant: " + retreat.getAttendant().getName());
		retreat.selectionMenu();
//		Dragon dragon = new Dragon("Amaree");
//		Penguin penguin = new Penguin("Kiyan");
//		Eagle eagle = new Eagle("Frank");
//		
//		retreat.addAnimal(dragon);
//		retreat.addAnimal(penguin);
//		retreat.addAnimal(eagle);
//		
//		System.out.println();
//
//		System.out.println();
//
//		System.out.println("Hello I'm " + dragon.getName() + " the Dragon.");
//		
//		System.out.println();
//
//		System.out.println("Hello I'm " + penguin.getName() + " the Penguin.");
//		
//		System.out.println();
//
//		System.out.println("Hello I'm " + eagle.getName() + " the Eagle.");
//		
//		System.out.println();

	}

}
