package Programming;

import java.util.Scanner;

public class ScannerClass {
@SuppressWarnings("resource")
public static void main(String[] args) {
	int a;
	String b;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your id");
	a=input.nextInt();
	System.out.println("You entered "+a);
	
	System.out.println("Please enter your Name");
	b=input.next();
	System.out.println("You entered "+b);
}
}
