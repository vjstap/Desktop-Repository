package quizVideo;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input = scnr.nextLine();
		
		printReverse(input);
		
		scnr.close();
	}
	private static void printReverse (String str) {
		str = "hello";
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
