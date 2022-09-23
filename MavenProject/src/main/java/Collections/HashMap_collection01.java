package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HasMap use to store key and Valur. key->Adress and Value->Data
		
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(23, "Maharastra");
		map.put(25, "Gujrat");
		map.put(30, "Panjab");
		map.put(36, "Delhi");
		
		for(Map.Entry<Integer, String> r:map.entrySet())
		{
			System.out.println("Key= "+r.getKey()+"Value= "+r.getValue());
		}
		
		
		System.out.println("========================");
		
		//we can replace the "string "on any 'key' derectly
		
		map.put(25, "Bengol");
		
		for(Map.Entry<Integer, String> r:map.entrySet())
		{
			System.out.println("Key= "+r.getKey()+"Value= "+r.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
