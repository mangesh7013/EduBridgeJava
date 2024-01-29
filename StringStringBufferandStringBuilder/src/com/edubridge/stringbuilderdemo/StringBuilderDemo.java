package com.edubridge.stringbuilderdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("Mangesh is a java trainer");
		System.out.println(b);
		System.out.println(b.capacity());
		System.out.println(b.append(" of EduBridge"));

	}

}
