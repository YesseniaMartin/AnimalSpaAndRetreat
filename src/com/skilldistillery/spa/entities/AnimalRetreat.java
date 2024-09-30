package com.skilldistillery.spa.entities;

import java.util.Arrays;
import java.util.Scanner;

public class AnimalRetreat {
	// fields
	private Attendant attendant;
	Animal[] animalRooms = new Animal[10];

	// Constructors

	public AnimalRetreat() {
	}

	public AnimalRetreat(String attendantName) {
		setAttendant(new Attendant(attendantName));

	}

	// Methods
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
	public void startAttendantRounds(Animal[] animals, int foodAmount) {
		getAttendant().makeRounds(animals, foodAmount);
	}
	
	public void introduction() {
		System.out.println("The COMPLETION of our NEW Animal Retreat and Spa Resort is now OPEN! "
				+ "We welcome our non-human guests, and invite them all to luxuriate in delight!\n"
				+ "We've hired the best attendant to provide for all our guests. \n"
				+ "Sara the Attendant , please introduce yourself!");
		System.out.println("Hello, nice to meet you!");
	}
	
	public void selectionMenu() {
		Dragon dragon = new Dragon("Amaree");
		Penguin penguin = new Penguin("Kiyan");
		Eagle eagle = new Eagle("Frank");

		Scanner menu = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
		System.out.println("Please select an option (1-4) from the menu below:");
		System.out.println("---MENU--------------------");
		System.out.println("1) List all animal         ");
		System.out.println("2) Add animal              ");
		System.out.println("3) Start attendant rounds  ");
		System.out.println("4) Close inn for the night ");
		System.out.println("---------------------------");
		
		
		
		int selection;
        if (menu.hasNextInt()) {
            selection = menu.nextInt();
            menu.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                menu.nextLine();
                continue;
                }
    
        switch (selection) {
        case 1:
            listAnimal();
            break;
            
        case 2:
        	Scanner keyboard = new Scanner(System.in);
        	System.out.print("Enter the name of the animal: ");
        	String animalName = keyboard.nextLine();
        	System.out.println("You entered: " + animalName);
        	Animal newAnimal = new Dragon(animalName);
        	newAnimal.getName();
        	addAnimal(newAnimal);
        	System.out.println();
        	break;
        	
        case 3:
        	startAttendantRounds(animalRooms, 12);
        	break;
        	
        case 4:
        	System.out.println("Closing the inn for the night. Thank you!");
            running = false;
        	break;
        default:
            System.out.println("Invalid selection. Please choose a number between 1 and 4.");
        	}
		}
	}

	

	public void listAnimal() {
		System.out.println("Listing animals in the retreat:");
		
		for (int i = 0; i < animalRooms.length; i++) {

			if (animalRooms[i] != null) {
				System.out.println(animalRooms[i].getName() + " is in room " + i);
			} else if (animalRooms[i] == null) {
				System.out.println("This room is empty");
			}
		}
	}

	public void addAnimal(Animal animal) {
		
		for (int i = 0; i < animalRooms.length; i++) {
			if (animalRooms[i] == null) {
				animalRooms[i] = animal;
				System.out.println("Make yourself at home, " + animal.getName());
				return;
			}
		}
		if (animal != null) {
			System.out.println("No room at the retreat and spa, try again tomorrow.");
		}
	}


	public Attendant getAttendant() {
		return attendant;
	}

	@Override
	public String toString() {
		return "AnimalRetreat [attendant=" + attendant + ", animalRooms=" + Arrays.toString(animalRooms)
				+ ", getAttendant()=" + getAttendant() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}