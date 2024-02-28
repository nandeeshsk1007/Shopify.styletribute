package Programming2;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string1 = input.next();
		String string2 = input.next();
		System.out.println(string1.compareTo(string2));
		if(string1.compareTo(string2)>0) {
			System.out.println("First string is greater than second");
		}
		else if(string1.compareTo(string2)<0) {
			System.out.println("Second string is greater than first");
		}
		else {
			System.out.println("Both strings are equal.");
		}
	}
}
