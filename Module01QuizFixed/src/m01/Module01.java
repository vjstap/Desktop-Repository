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
		StringBuilder sb = new StringBuilder(word.toLowerCase().replace("_", ""));
		if(sb.length() > 0 && sb.charAt(0) == 'a') {
			sb.setCharAt(0, 'A');
		}
		if(sb.length() > 0 && sb.charAt(sb.length() - 1) == 'z') {
			sb.setCharAt(sb.length() - 1, 'Z');
		}
			StringBuilder temp = new StringBuilder(sb);
			sb.append(temp.reverse());
			return sb.toString();
		}
	/**
	 * methodB checks checks if ae, oe, ue, and eu are in string and if they are only to count them as 1 letter.
	 * @param letters string that is being passed through method
	 * @return return the amount of letters
	 */
	public static int methodB(String letters) {
		if(letters == null || letters.isEmpty()) {
			return 0;
		}
		
		int letterCount = 0;
		for(int i = 0; i < letters.length(); i++) {
			if (i < letters.length() - 1) {
	            String pair = letters.substring(i, i + 2).toLowerCase();
	            if (pair.equals("ae") || pair.equals("oe") || pair.equals("ue") || pair.equals("eu")) {
	                letterCount++;
	                i++; // Skip the next character since it's part of the pair
	                continue;
	            }
	        }
			letterCount++;
		}
		return letterCount;
	}
}