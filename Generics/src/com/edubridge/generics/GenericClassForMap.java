package com.edubridge.generics;

import java.util.Dictionary;

// program to demonstrate on a Generic class by passing Multiple same type
class Citizen< k,v>{
	k key;
	v value;
	
	void print(k key, v value) {
		//where T defines any kind of Types-Value
		this.key=key;
		this.value=value;
		System.out.println("This values is :"+key+" "+value);
	}
}
// driver-class
public class GenericClassForMap {

	public static void main(String[] args) {
		Dictionary<Character, String>obj=new Dictionary<>();
		obj.print('c', "Cyclone");
		obj.print('d', "dynamic");
		

	}

}
