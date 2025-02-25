package stringBuilder;

/**
 * This class demonstrates the use of StringBuilder in Java it includes examples of common methods such as append, replace, insert, delete, and reverse
 * @author vincentstapley
 * @version 1 01/29/2025
 */
public class StringBuilderExamples {
	
	public static void main(String[] args) {
		//Example 1: using append();
		demonstrateAppend();
		//Example 2: using replace();
		demonstrateReplace();
		//Example 3: using insert();
		demonstrateInsert();
		//Example 4: using delete();
		demonstrateDelete();
		//Example 5: using reverse();
		demonstrateReverse();
	}

	/**
	 * Demonstrates the use of the append() method in StringBuilder
	 */
	public static void demonstrateAppend() {
		StringBuilder sb = new StringBuilder ("Hello");
		sb.append(", ").append("World!"); //
		System.out.println("After append: " + sb);
	}
	
	/**
	 * Demonstrates the use of the replace() method in StringBuilder
	 */
	public static void demonstrateReplace() {
		StringBuilder sb = new StringBuilder("Hello Beautiful World");
		sb.replace(6, 15, "Amazing"); //Replaces "Beautiful" with "Amazing"
		System.out.println("After replace: " + sb);
	}
	
	/**
	 * Demonstrates the use of the insert() method in StringBuilder
	 */
	public static void demonstrateInsert() {
		StringBuilder sb = new StringBuilder("Hello World");
		sb.insert(6, "Beautiful"); //Insert text at index 6
		System.out.println("After insert: " + sb);
	}
	
	/**
	 * Demonstrates the use of the delete() method in StringBuilder
	 */
	public static void demonstrateDelete() {
		StringBuilder sb = new StringBuilder("Hello Amazing World");
		sb.delete(6,  14); //Deletes "Amazing"
		System.out.println("After delete: " + sb);
	}
	
	/**
	 * Demonstrates the use of the reverse() method in StringBuilder
	 */
	public static void demonstrateReverse() {
		StringBuilder sb = new StringBuilder("Hello World");
		sb.reverse(); //Reverse the text
		System.out.println("After reverse: " + sb);
	}
	
}
