package com.edubridge.stringstatment;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String str1="Nikita kar";
		String str2="";
		System.out.println(str1.length());
		//to convert string into character arrays.
		char []arr=new char[10];
		str1.getChars(0, 10, arr, 0);
		System.out.println(Arrays.toString(arr));
		System.out.println(str1.compareTo("nia shaRma"));
		System.out.println(str1.compareTo("Nia Sharma"));
		System.out.println(str1.compareToIgnoreCase("nia sharma"));
		System.out.println(str2.isEmpty());//true
		System.out.println(str2.isBlank());
		System.out.println(str1.charAt(4));
		System.out.println("Hey guys you area awesome".startsWith("He"));
		System.out.println("hey guys you are awesome".endsWith("some"));
		System.out.println(str1.toUpperCase());
		System.out.println("The karan Luthara ".trim());
		System.out.println("The karan Luthara ".strip());
		

	}

}
