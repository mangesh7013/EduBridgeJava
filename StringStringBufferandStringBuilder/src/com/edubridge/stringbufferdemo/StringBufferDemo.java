package com.edubridge.stringbufferdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Shiwani");
		System.out.println(b.capacity());
		String str="EduBridge";
		//StringBuffer b1=new StringBuffer(str.length());
		//System.out.println(b1.capacity());
		b= new StringBuffer("EduBridge");
		System.out.println(b.capacity());//17
		/* as String is immutable we cant do a 
		 * modification
		 */ 
		//System.out.println(str.append("India"));
		System.out.println(b.append("india"));
		b.setCharAt(9, 'z');
		System.out.println(b); 

	}

}
