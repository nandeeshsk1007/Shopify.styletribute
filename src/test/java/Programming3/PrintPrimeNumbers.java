package Programming3;

import java.util.Scanner;

public class PrintPrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int status=0, n=3;
		if(num>1) {
			System.out.println("2");
		}
		for(int i=2; i<=num;) {
			for(int j=2; j<=n; j++) {
				if(n%2==0) {
					status=1;
					break;
				}
			}
			if(status==0) {
				i++;
				System.out.println(n);
			}
			n++;
			status=0;
		}
	}
}