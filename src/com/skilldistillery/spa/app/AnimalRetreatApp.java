package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.Dragon;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		app.run();
	}
	
	
	public void run() {
		Dragon dragon = new Dragon("Frank");
		System.out.println(dragon.getName());

	}

}
