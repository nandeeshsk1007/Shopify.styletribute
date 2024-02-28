package Programming3;

public class MultiDimentionalArray {
	public static void main(String[] args) {

		int mul[] [] []= {{{1,8,2}, {5,4,8}}, {{9,6,4},{1,5,8}, {7,9,4}}};
		System.out.println("Lenght of the array is "+mul.length);
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					try {
						System.out.println(mul[i][j][k]);
					} 
					catch (Exception e) {
					}
					
				}
			}
		}
	}
}
