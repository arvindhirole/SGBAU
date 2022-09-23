package Collections;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it is use to store the data
		//good for data retrival
		//wrost for data insertion and delete bcause it change index on every operation
		
		ArrayList<String> arr=new ArrayList<String>();   //here,<String>is Generic
		
		//data insertion
		arr.add("Mumbai");
		arr.add("Pune");
		arr.add("Hydrabad");
		arr.add("Jalgaon");
		
		int size=arr.size();
		
		//data retrive
		for(int i=0; i<size; i++)
		{
			
			System.out.println(arr.get(i));
		}
		
		System.out.println("==============================");
		//data delete
		arr.remove(1);
		for(int i=0; i<size; i++)
		{
			
			System.out.println(arr.get(i));
		}
		
	}

}
