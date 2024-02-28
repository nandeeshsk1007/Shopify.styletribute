package Programming2;

import java.util.Scanner;

public class MultiplicationWithRangeOfNumbers {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int b = input.nextInt();
	for(int i=a; i<=b; i++) {
		for(int j=1; j<=10; j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}
		System.out.println();
	}
}
}
