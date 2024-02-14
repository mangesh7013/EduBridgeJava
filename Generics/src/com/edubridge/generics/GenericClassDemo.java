package com.edubridge.generics;
// program to demonstrate on a Generic class by passing Single same type
class Citizen<T>{
	T str;
	T str1;
	
	void print(T str, T str1) {
		//where T defines any kind of Types-Value
		this.str=str;
		this.str=str1;
		System.out.println("This values is :"+str+" "+str1);
	}
}
// driver-class
public class GenericClassDemo {

	public static void main(String[] args) {
		Citizen<String> c=new Citizen<>();
		c.print("Nagpur ", "Indian");
		

	}

}
