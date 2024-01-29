package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerLets {

	public static void main(String[] args) {
		StringTokenizer t1=new StringTokenizer(" ");
		t1=new StringTokenizer("Edu-Bridge-India","-",false);
		while(t1.hasMoreTokens())
		{
			System.out.println(t1.nextToken());
		}
		

	}

}
