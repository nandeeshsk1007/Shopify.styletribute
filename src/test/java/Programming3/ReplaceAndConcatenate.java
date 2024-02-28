package Programming3;

public class ReplaceAndConcatenate {
public static void main(String[] args) {
	String value="Hello Ram";
	int lengthOfValue;
	String replaceValue;
	String concatenateValue;
	
	lengthOfValue=value.length();
	System.out.println(lengthOfValue);
	
	replaceValue=value.replace("Hello", "Mr.");
	System.out.println(replaceValue);
	
	concatenateValue=value.concat(", How are you?");
	System.out.println(concatenateValue);
}
}
