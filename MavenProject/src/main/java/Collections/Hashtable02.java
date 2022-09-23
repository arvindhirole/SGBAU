package Collections;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashtable is same as HashMap
				//HasMap use to store key and Valur. key->Adress and Value->Data
				//HashMap dont allow  null key and  null values, it will give exception in output
						
						
							Hashtable<Integer, String> map=new Hashtable<Integer, String>();
									
										
							  map.put(23, "Maharastra");	
							  map.put(null,"Gujrat");
							  map.put(30, null);
							  map.put(40, "Delhi");
									
							for(Map.Entry<Integer, String> r:map.entrySet())
								{
									System.out.println("Key= "+r.getKey()+"    Value= "+r.getValue());
								}
									
									
							System.out.println("========================");
									
	}

}
