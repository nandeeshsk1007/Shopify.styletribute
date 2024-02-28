package Programming3;

public class IndexOf {
public static void main(String[] args) {
	
	String value="this is index of example";
	
	int indexNo = value.indexOf("index");
	System.out.println(indexNo);
	
	int index2 = value.indexOf("h",2);
	System.out.println(index2);
}
}
