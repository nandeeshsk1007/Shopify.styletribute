package Programming2;

public class NumOfStars {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Next");
		for(int i=5; i>=1; i--) {
			for(int l=1; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
