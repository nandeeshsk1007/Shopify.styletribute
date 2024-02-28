package Programming;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {
public static void main(String[] args) {
	String num1, num2;
	Scanner input = new Scanner(System.in);
	num1=input.nextLine();
	num2=input.nextLine();
	BigInteger first = new BigInteger(num1);
	BigInteger second = new BigInteger(num2);
	BigInteger sum = first.add(second);
	System.out.println(sum);
}
}
