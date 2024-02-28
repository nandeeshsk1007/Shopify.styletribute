package Programming;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfABigNumber {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	BigInteger fac = new BigInteger("1");
	BigInteger inc = new BigInteger("1");
	
	int num = input.nextInt();
	
	for(int c=1; c<=num; c++) {
		fac=fac.multiply(inc);
		System.out.println(fac);
		inc=inc.add(BigInteger.ONE);
		//System.out.println(fac);
	}
	System.out.println(fac); 
}
}
