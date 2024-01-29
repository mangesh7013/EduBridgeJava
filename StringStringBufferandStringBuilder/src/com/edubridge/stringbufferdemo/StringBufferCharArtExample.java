package com.edubridge.stringbufferdemo;

public class StringBufferCharArtExample {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Try");
		b= new StringBuffer("EduBridge");
		b.setCharAt(9, 'z');
		System.out.println(b);
		

	}

}
