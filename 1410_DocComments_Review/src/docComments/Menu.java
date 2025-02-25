package docComments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Menu with options for user to view, add, delete, and find consoles in
 * addition to the exact amount of consoles
 * 
 * @author vincentstapley
 * @version 1
 */

public class Menu {
	public static ArrayList<Console> consoles = new ArrayList<>();
	public static Scanner scnr = new Scanner(System.in);

	/**
	 * Initializes four consoles and starts menu
	 */
	public static void main(String[] args) {
		consoles.add(new Console("Microsoft", "Xbox Series X", "1TB"));
		consoles.add(new Console("Sony", "Playstation 5", "1TB"));
		consoles.add(new Console("Nintendo", "Switch", "512GB"));
		consoles.add(new Console("Nintendo", "Wii", "512MB"));

		menu();// Calls menu method
	}

	/**
	 * Displays menu and waits for user input, ends when user chooses to end program
	 */
	private static void menu() {
		while (true) { // Runs loop until quit

			printMenu(); // Calls printMenu which runs the menu

			int input = scnr.nextInt(); // User input for menu
			System.out.println();
			scnr.nextLine(); // Eats line

			switch (input) { // Switch with options for each user input 1 through 6
			case 1:
				showConsoles(); // Calls showConsoles
				break;
			case 2:
				addConsole(); // Calls addConsole
				break;
			case 3:
				findConsole(); // Calls findConsole
				break;
			case 4:
				deleteConsole(); // Calls deleteConsole
				break;
			case 5:
				numConsoles(); // Calls numConsoles
				break;
			case 6:
				System.out.println("Goodbye!");
				System.exit(0); // Exits program
				break;
			default:
				System.out.println("Please enter valid selection from 1 - 6\n"); // Tells user if input is invalid
			}

		}

	}

	/**
	 * Prints the menu with available options
	 */
	private static void printMenu() {
		System.out.println("1. Show all consoles");
		System.out.println("2. Add a console");
		System.out.println("3. Find a console");
		System.out.println("4. Delete a console");
		System.out.println("5. Number of consoles");
		System.out.println("6. Exit");
		System.out.print("Enter your selection:");
	}

	/**
	 * Displays each console in system
	 */
	private static void showConsoles() {
		for (int i = 0; i < consoles.size(); i++) {
			System.out.println(consoles.get(i));
		}
		System.out.println();
	}

	/**
	 * Adds console to system
	 */
	private static void addConsole() {
		System.out.print("Enter brand:");
		String brand = scnr.nextLine();
		System.out.print("Enter model:");
		String model = scnr.nextLine();
		System.out.print("Enter storage");
		String storage = scnr.nextLine();

		System.out.println();

		consoles.add(new Console(brand, model, storage)); // Creates new instance of Console with user input
	}

	/**
	 * Searches through each console using provided id from user
	 */
	private static void findConsole() {
		System.out.print("Id:");
		int input = scnr.nextInt();
		boolean found = false;

		for (int i = 0; i < consoles.size(); i++) {
			if (consoles.get(i).getId() == input) {
				found = true;
				System.out.println(consoles.get(i));
			}
		}
		System.out.println();
		if (!found) {
			System.out.println("The id " + input + " could not be found");
			System.out.println();
		}
	}

	/**
	 * Deletes a console from system using user provided id
	 */
	private static void deleteConsole() {
		System.out.print("Id:");
		int input = scnr.nextInt();
		boolean found = false;

		for (int i = 0; i < consoles.size(); i++) {
			if (consoles.get(i).getId() == input) {
				found = true;
				System.out.println(consoles.get(i) + " has been deleted");
				consoles.remove(i);
			}
		}
		System.out.println();
		if (!found) {
			System.out.println("Invalid id");
		}
	}

	/**
	 * Displays total amount of consoles in system
	 */
	private static void numConsoles() {
		System.out.println("Number of consoles: " + consoles.size() + "\n");

	}

}
