package m01;

/**
 * @author vincentstapley
 */
public class Module01 {
	/**
	 * Transform method sends string through toLowerCase method, deletes any underscores, capizalizes any a at the beginning of string, capizalizes z at the end of string,
	 * and reverses whole string and adds it to itself.
	 * @param word string that is passed through transform
	 * 
	 */
	public static String transform(String word){
		String result = word;
		if(word == null) {
			return null;
		}
		for(int i = 0; i < word.length(); i++) {
			StringBuilder sb = new StringBuilder(word.toLowerCase());
			boolean containsChar = word.contains(String.valueOf("_"));
			int underscore = sb.indexOf("_");
			
			if(containsChar) {
				sb.deleteCharAt(underscore);
			}
			if(sb.charAt(0) == 'a') {
				sb.setCharAt(0, 'A');
			}
			if(sb.charAt(sb.length() -1) == 'z') {
				sb.setCharAt(sb.length() - 1 , 'Z');
			}
			StringBuilder temp = new StringBuilder(sb);
			sb.append(temp.reverse());
			
			result = sb.toString();
		}
		return result;
	}
	/**
	 * methodB checks checks if ae, oe, ue, and eu are in string and if they are only to count them as 1 letter.
	 * @param letters string that is being passed through method
	 * @return return the amount of letters
	 */
	public static int methodB(String letters) {
		int letterCount = 0;
		boolean containsAE = letters.contains("ae");
		boolean containsOE = letters.contains("oe");
		boolean containsUE = letters.contains("ue");
		boolean containsEU = letters.contains("eu");
		for(int i = 0; i < letters.length(); i++) {
			if(containsAE) {
				letterCount++;
				i++;
			} else if(containsOE) {
				letterCount++;
				i++;
			} else if(containsUE) {
				letterCount++;
				i++;
			} else if(containsEU) {
				letterCount++;
				i++;
			}
			else {
				letterCount++;
			}
		}
		return letterCount;
	}
}