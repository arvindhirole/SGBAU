package Collections;

import java.util.HashSet;

public class HashSetcollection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it is use to store set of data
		//here adress concept is not present like ArrayList
		//to print all data at a time we use Advance for loop 
	
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(23);
		set.add(50);
		set.add(100);
		set.add(200);
		
		//Advance for loo
		
		for(int i:set)
		{
			System.out.println(i);
		}
		
		System.out.println("================");
		
		set.remove(23);
		for(int i:set)
		{
			System.out.println(i);
		}
		
		System.out.println("====================");
		
		
	
		
		
		
		
	
	
	
	}

}
