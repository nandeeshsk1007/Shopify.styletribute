package Programming;

import java.util.Scanner;

public class IfElseclause {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	boolean value = input.nextBoolean();
	if(value) {
		System.out.println("Condtion is True");
	}
	else {
		System.out.println("Condtion is False");
	}
}
}
