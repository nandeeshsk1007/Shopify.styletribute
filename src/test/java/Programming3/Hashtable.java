package Programming3;
import java.util.*; 
public class Hashtable {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]){ 
		java.util.Hashtable<Integer, String> hm = new java.util.Hashtable<Integer, String>();
		hm.put(100, "Hello");
		hm.put(101,"Rajendra"); 
		hm.put(102,"Praveen"); 
		hm.put(103,"Pankaj");
		for(Map.Entry m:hm.entrySet()){ 
			System.out.println(m.getKey()+" "+m.getValue()); 
		} 
		System.out.println(hm);
	} 
}

