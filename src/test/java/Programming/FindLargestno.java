package Programming;

import java.util.Scanner;

public class FindLargestno {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	int y = input.nextInt();
	int z = input.nextInt();
	if(x>y && x>z) {
		System.out.println("Fisrt number is largest.");
	}
	else if(y>x && y>z) {
		System.out.println("Second number is largest.");
	}
	else if(z>y && z>y) {
		System.out.println("Lasr number is largest.");
	}
	else {
		System.out.println("Entered numbers are not distinct.");
	}
}
}
