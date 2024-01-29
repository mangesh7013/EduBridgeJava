package com.edubridge.stringtokenizerdemo;
import java.util.StringTokenizer;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer t=new StringTokenizer(" "+ "Hey there, I am using string ");
		//System.out.println(t.countTokens());
		//System.out.println(t.nextToken());
		
		while(t.hasMoreTokens())
		{
			System.out.println(t.nextToken());
		}

	}

}
