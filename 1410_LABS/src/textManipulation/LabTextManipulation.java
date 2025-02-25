package textManipulation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program that takes input from user(favorite national parks) and adds them to an ArrayList in format
 * "Favorite National Parks: Example1 | Example2 | Example 3"
 * by change every input into substrings and adding them back to the list after .toLowerCase() and .toTitleCase() methods
 * @author vincentstapley
 * @version 1 01/29/2025
 */
public class LabTextManipulation {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> parks = new ArrayList<>();
		
		/**
		 * While loop that takes in user input for each national park until any case of "done" is entered
		 */
		while(true) {
			System.out.print("Please enter your favorite National park or DONE to stop: ");
			String input = scnr.nextLine();
			
			if(input.toLowerCase().equals("done")) {
				break;
			} else {
				parks.add(updateSpelling(input));
			}
		}
		StringBuilder sb = new StringBuilder();

		/**
		 * For loop that appends each entry besides the last and adds " | "
		 */
		for(int i = 0; i < parks.size(); i++) {
			sb.append(parks.get(i));
			if(i < parks.size() - 1) {
				sb.append(" | ");
			}
		}
		
		System.out.println("Favorite National Parks: " + sb.toString());
		
	}
	/**
	 * Method for splitting each word in a string into individual substrings and capitalizing the first letter of each substring
	 * @param text input from user that is run through the method updateSpelling
	 * @return Returns string of each national park with proper capitalization
	 */
	private static String updateSpelling(String text) {
		String[] nationalParks = text.toLowerCase().split("\\s");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < nationalParks.length; i++) {
			String word = nationalParks[i];
			if(!word.isEmpty()) {
				sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}
		return sb.toString().trim();
	}
}