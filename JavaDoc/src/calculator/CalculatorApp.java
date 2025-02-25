package calculator;
import java.util.Scanner;

/**
 * A class to demonstrate the usage of the calculator class.
 * It contains the main method for user interaction
 * 
 * @author vincentstapley
 * @version 1
 */
public class CalculatorApp {
	
	/**
	 * Main Method to demonstrate the Calculator class.
	 * @param args Command -line argument (not used).
	 * 
	 * @throws IllegalArgumentException if invalid input is provided to the methods.
	 */

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Calculator calc = new Calculator();
		System.out.println("Enter first integer:");
		int a = scnr.nextInt();
		System.out.println("Enter second integer:");
		int b = scnr.nextInt();
		
		try {
			//System.out.println("Sum: " + calc.add(5, 3)); //Example usage of the add method
			//System.out.println("Product: " + calc.multiply(5, 3)); //Example usage of the multiply method
			System.out.println("Sum of " + a + " and " + b + " is: " + calc.add(a, b));
			System.out.println("Product of " + a + " and " + b + " is: " + calc.multiply(a, b));
			
		} catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
