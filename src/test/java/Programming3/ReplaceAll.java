package Programming3;

public class ReplaceAll {
	public static void main(String[] args) {
		String value="My name is Rajendra. My name is lamror. My name is Technolamror.";
		
		String replacefirst = value.replaceFirst("is", "was");
		String replaceall=value.replaceAll("is", "was");
		
		System.out.println(replacefirst);
		System.out.println(replaceall);
	}
}
