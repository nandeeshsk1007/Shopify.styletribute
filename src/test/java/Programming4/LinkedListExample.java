package Programming4;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		System.out.println(ll);
		ll.addFirst("0");
		System.out.println(ll);
		ll.set(0, null);
		System.out.println(ll);
	}
}		