package Programming2;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int rev=0;
		while(value!=0) {
			rev=rev*10;
			rev=rev+value%10;
			value=value/10;
			
			System.out.println(rev);
		}
		System.out.println(rev);
	}
}
