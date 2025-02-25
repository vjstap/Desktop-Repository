package textManipulation;
import java.util.ArrayList;
import java.util.Scanner;

public class LabTextManipulation1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> parks = new ArrayList<>();
		
		while(true) {
			System.out.print("Please enter your favorite National park or DONE to stop: ");
			String input = scnr.nextLine();
			
			if(input.toLowerCase().equals("done")) {
				break;
			} else {
				parks.add(updateSpelling(input));
			}
		}
		
		System.out.println("Favorite National Parks: ");
		
	}
	private static String updateSpelling(String text) {
		StringBuilder sb = new StringBuilder();
		return text;
	}
}