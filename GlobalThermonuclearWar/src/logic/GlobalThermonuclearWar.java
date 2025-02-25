package logic;

import java.util.Random;
import java.util.Scanner;

public class GlobalThermonuclearWar {
	private int player1Missiles;
	private int player2Missiles;
	private int player1Budget;
	private int player2Budget;
	private String player1 = "Player One";
	private String player2 = "Player Two";
	private boolean gameOver;
	private Scanner scnr;
	private Random rand;
	
	public GlobalThermonuclearWar() {
		player1Missiles = 0;
		player2Missiles = 0;
		gameOver = false;
		scnr = new Scanner(System.in);
		rand = new Random();
		initializePlayers();
	}
	
	private void initializePlayers() {
		System.out.println(player1 + " choose your country.)");
		System.out.println("1. United States. (Budget: 12000)");
		System.out.println("2. USSR. (Budget: 10000)");
		System.out.println("3. China. (Budget: 13000)");
		int player1Choice = scnr.nextInt();
		player1Budget = getStartingBudget(player1Choice);
		player1 = getPlayerCountry(player1Choice);
		
		System.out.println(player2 + " choose your country.");
		System.out.println("1. United States. (Budget: 12000)");
		System.out.println("2. USSR. (Budget: 10000)");
		System.out.println("3. China. (Budget: 13000)");
		int player2Choice = scnr.nextInt();
		player2Budget = getStartingBudget(player2Choice);
		player2 = getPlayerCountry(player2Choice);
	}
	private int getStartingBudget(int choice) {
		switch(choice) {
		case 1: return 12000;
		case 2: return 10000;
		case 3: return 13000;
		default: return 12000;
		}
	}
	private String getPlayerCountry(int choice) {
		switch(choice) {
		case 1: return "USA";
		case 2: return "USSR";
		case 3: return "China";
		default: 
			System.out.println("Invalid choice, defaulting to USA");
			return "USA";
		}
	}
}
