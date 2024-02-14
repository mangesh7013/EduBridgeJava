package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantagesDemo {

	public static void main(String[] args) {
		// Type-safety
		
		List<String> obj=new ArrayList<>();
		//it ensure that to add only String value
		//obj.add(11);
		
		obj.add("11");
		obj.add("Mangesh");
		
		//2. With Generic, Type-Casting is not required 
		//List obj1=new ArrayList<>();
		List<String> obj1=new ArrayList<>();
		obj.add("Mangesh Shukla");
		/*Without generic, type-casting is required */
		//String str1=(String) obj1.get(0);
		
		String str1=obj1.get(1);
		System.out.println(str1);
		
		

	}

}
