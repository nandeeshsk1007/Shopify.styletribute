package Programming;

public class CommandLineArguments {
public static void main(String[] args) {
	for(String t:args) {
		System.out.println(t);
	}
	System.out.println(args[2]);
	
	for(String a:args)
		System.out.println(a);
//	System.out.println("5");
}
}