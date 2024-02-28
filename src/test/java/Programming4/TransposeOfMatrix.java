package Programming4;

import java.util.Scanner;

import org.apache.pdfbox.util.Matrix;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m, n;
		int o, p;
		System.out.println("enter no of rows and columns");
		m=in.nextInt();
		n=in.nextInt();
		int[][] matrix = new int[m] [n];
		
		System.out.println("Enter elements of matrix");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix [i] [j]=in.nextInt();
			}
		}
		int transpose [] [] = new int[n] [m];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				transpose [j] [i]=matrix [i] [j];
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(transpose [i] [j]+"\t");
			}
				System.out.print("\n");
		}
	}
}
