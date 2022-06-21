package POJO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class Coll {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Rajik");
		al.add(9);
		al.add('R');
		al.add("Rajik");
		al.add(null);
		
		for(int i=0; i<al.size();i++){
			{System.out.println(al.get(i));}
		}
		
		LinkedList ll = new LinkedList();
		ll.add("Sheikh");
		ll.add(7);
		ll.add('S');
		ll.add(null);
		ll.add(null);
		ll.add("Sheikh");
		
		for(int i=0; i<ll.size(); i++){
		{System.out.println(ll.get(i));}	
		}
		
		Vector v = new Vector();
		v.add("Guljar");
		v.add(null);
		v.add('G');
		v.add('G');
		
		for (int i=0; i<v.size(); i++) {
			{System.out.println(v.get(i));}
		}
	
	    PriorityQueue<String> pq = new PriorityQueue<String>();
	    pq.add("Rj");
	    pq.add("Ab");
	    //pq.add(null);
	    pq.add("Rj");
	    System.out.println(pq);
	
	    HashSet hs = new HashSet();
	    hs.add("Rajik");
	    hs.add(null);
	    hs.add('R');
	    
	    Iterator it = hs.iterator();
	    
	    while(it.hasNext()) {
	    	System.out.println(it.next());	}
	    
	    HashMap<Integer,String> hm = new HashMap<Integer,String>();
	    hm.put(1, "Devil");
	    hm.put(2, "Fire");
	
	
	}
	
}
