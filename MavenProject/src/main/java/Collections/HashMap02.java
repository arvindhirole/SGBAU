package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//HasMap use to store key and Valur. key->Adress and Value->Data
		//HashMap allow only one null key and multiple null values
		//if null key repeate then it skip it to print
		
				HashMap<Integer, String> map=new HashMap<Integer, String>();
				
					
				map.put(23, null);       //map.put(23, "Maharastra");	
				map.put(null, "Gujrat"); //map.put(50,"Gujrat");
				map.put(30, null);		 //map.put(30, "Punjab");
				map.put(null, "Delhi");  //map.put(40, "Delhi");
				
				for(Map.Entry<Integer, String> r:map.entrySet())
				{
					System.out.println("Key= "+r.getKey()+"Value= "+r.getValue());
				}
				
				
				System.out.println("========================");
				
				
				
		
		
		
		
		
	}

}
