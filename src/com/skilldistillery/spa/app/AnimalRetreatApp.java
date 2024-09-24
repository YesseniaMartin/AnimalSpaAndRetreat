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
		
		Dragon dragon = new Dragon("Frank");
		System.out.println(dragon.getName());
		
		
		
		Penguin penguin = new Penguin("Amaree");
		System.out.println(penguin.getName());
		
		Eagle eagle = new Eagle("Kiyan");
		System.out.println(eagle.getName());
				
		
		

	}

}
