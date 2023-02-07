package com.palle;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) 
	
	{
		Student s = new Student ();
		
		//s.creating();
		
		//s.inserting("babu","java","babu@gmail.com");
		//s.inserting ("lucky","j2ee","lucky@gmail.com");
		
		//s.updating(2,".net","abc@gmail.com");
		
		//s.deleting(2);
		
		//s.Read();
		
		ArrayList<B> aq=s.Reading();
		
		for( B item : aq)
		{
			System.out.println(item.getI());
			System.out.println(item.getE());
			System.out.println(item.getN());
			System.out.println(item.getS());
		}
		
		
		
		
		

	}
	

}
