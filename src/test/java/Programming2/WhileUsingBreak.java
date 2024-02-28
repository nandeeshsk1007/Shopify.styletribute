package Programming2;

import java.util.Scanner;

public class WhileUsingBreak {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	while(true) {
		int a = input.nextInt();
		if(a==0) {
			break;
		}
		else {
			System.out.println("You entered "+a);
		}
	}
}
}
