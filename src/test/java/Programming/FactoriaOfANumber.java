package Programming;

import java.util.Scanner;

public class FactoriaOfANumber {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	int fac = 1;
	if(num<0) {
		System.out.println("Number should not be non-negative");
	}
	else {
		for(int i=1; i<=num; i++) {
			fac=fac*i;
		}
		System.out.println(fac);
	}
}
}
