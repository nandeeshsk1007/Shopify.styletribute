package Programming4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class WrapperClass {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();

		for(int i=1; i<=5; i++)
			al.add(i);

		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.get(3));
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
		LinkedList<Object> Ll = new LinkedList<>();

		for(int i=1; i<=5; i++)
			Ll.add(i);

		System.out.println(Ll);
		Ll.remove(3);
		System.out.println(Ll);
		System.out.println(Ll.get(3));
		for(int i=0; i<Ll.size(); i++)
			System.out.println(Ll.get(i));
		Vector<Object> v = new Vector<>();

		for(int i=1; i<=5; i++)
			v.add(i);

		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		System.out.println(v.get(3));
		for(int i=0; i<v.size(); i++)
			System.out.println(v.get(i));

	}
}
