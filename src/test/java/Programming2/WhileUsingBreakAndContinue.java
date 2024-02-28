package Programming2;

import java.util.Scanner;

public class WhileUsingBreakAndContinue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			int a=input.nextInt();
			if(a!=0) {
				System.out.println("You entered "+a);
				continue;
			}
			else {
				break;
			}
		}
	}
}