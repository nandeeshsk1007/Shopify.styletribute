package Programming2;

import java.util.Scanner;

public class MultiplicationOfNumbers {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	
	for(int i=1; i<=10; i++) {
		System.out.println(num+"*"+i+"="+(num*i));
	}
}
}
