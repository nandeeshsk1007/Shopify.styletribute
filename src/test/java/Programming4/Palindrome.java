package Programming4;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome or not");
		String value = in.nextLine();
		String rev = "";
		
		for(int i=value.length()-1; i>=0; i--) {
			rev=rev+value.charAt(i);
//			System.out.println(rev);
//			System.out.println(5+rev);
		}
		
		if(rev.equals(value)) {
			System.out.println("Entered string is palindrome");
		}
		else {
			System.out.println("Entered string not a palindrome");
		}
	}
}
