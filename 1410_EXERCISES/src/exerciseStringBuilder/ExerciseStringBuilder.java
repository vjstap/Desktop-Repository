package exerciseStringBuilder;

public class ExerciseStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Cats live");
		sb.setCharAt(0, 'r');
		sb.append(" on ");
		
		StringBuilder temp = new StringBuilder(sb);
		sb.append(temp.reverse());
		
		int doubleSpace = sb.indexOf("  ");
		
		sb.deleteCharAt(doubleSpace);
		sb.append('.').setCharAt(0, 'C');
		
		System.out.println("sb: " + sb);
	}
}
