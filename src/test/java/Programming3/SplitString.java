package Programming3;

public class SplitString {
	public static void main(String[] args) {
		String value="Java is an Object oriented programming language";
		
		System.out.println(value);
		String[] words = value.split("\\s");
		for(String in:words) {
			System.out.println(in);
		}
	}
}