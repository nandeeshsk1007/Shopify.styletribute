package Programming4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
		public static void main(String[] args) {
			ArrayList<String> al = new ArrayList<>();
			al.add("hari");
			al.add("ramu");
			al.add("lakshman");
			al.add("krish");
			System.out.println(al);
			al.set(2, "shiva");
			System.out.println(al);
			Collections.sort(al);
			System.out.println(al);
			
			Collections.sort(al,Collections.reverseOrder());
			System.out.println(al);
			String s="jsd";
			int a=611;
			String v = a+s;
			System.out.println(v);
		}
}
