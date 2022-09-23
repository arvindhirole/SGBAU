package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetWhileLoop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we can print by using while loop but it is quit difficult
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		
		int s=set.size();
		
		Iterator<Integer> i=set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
