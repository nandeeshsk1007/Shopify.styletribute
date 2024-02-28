package Programming4;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormator {
	public static void main(String[] args) {
		double decimal_value=562.516454;

		//To get value after "."
		String value = String.valueOf(decimal_value);
		String one = value.substring(value.indexOf(".")+1);
		System.out.println(one);

		DecimalFormat formator = new DecimalFormat("#.##");
		System.out.println(one.charAt(2));
		char num = one.charAt(2);
		
		if(num-48>5) {
			formator.setRoundingMode(RoundingMode.UP);
			System.out.println(formator.format(decimal_value));
		}
		else {
			formator.setRoundingMode(RoundingMode.DOWN);
			System.out.println(formator.format(decimal_value));
		}
	}
}