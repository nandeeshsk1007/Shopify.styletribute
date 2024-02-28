package Programming3;

import java.util.Scanner;

public class PrintNonPrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total_num = input.nextInt();
		int nop=4, status=0; 
		for(int i=1; i<=total_num;) {
			for(int j=4; j<=nop; j++) {
				if(nop%2!=0) {
					status=1;
					break;
				}
			}
			if(status==0) {
				System.out.println(nop);
				i++;
			}
			status=0;
			nop++;
		}
	}
}