package Collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ArrayList without Generics
		//Alltype od data can be store here like char,int,sting in list
		
		
		ArrayList arr=new ArrayList();  //No generic
		
		arr.add("Maharastra");
		arr.add(100);
		arr.add('@');
		
		int s=arr.size();
		
		for(int i=0; i<s; i++)
		{
			System.out.println(arr.get(i));
		}
		
		
		
	}

}
