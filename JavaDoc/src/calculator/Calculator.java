package calculator;

/**
 * A simple Calculator class that performs basic arithmetic operations.
 * This class handles the addition and multiplication.
 * @author vincentstapley
 * @version 1
 */

public class Calculator {
	/**
	 * Adds two integers
	 * 
	 * @param a the first integer.
	 * @param b the second integer.
	 * @return The sum of a and b.
	 * @throws IllegalArgumentException if either a or b is negative.
	 */
	
	public int add(int a, int b) throws IllegalArgumentException {
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException ("Both numbers must be non-negative");
		}
		return a + b;
	}
	
	/**
	 * Multiplies two integers.
	 * 
	 * @param a the first integer
	 * @param b the second integer
	 * @return the product of a and b.
	 */
	public int multiply(int a, int b) {
		return a * b;
	}
}
