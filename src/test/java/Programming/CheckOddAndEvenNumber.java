package Programming;

import java.util.Scanner;

public class CheckOddAndEvenNumber {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	
	if(num%2==0) {
		System.out.println("The entered number is even number");
	}
	else {
		System.out.println("The entered number is odd number");
	}
}
}
