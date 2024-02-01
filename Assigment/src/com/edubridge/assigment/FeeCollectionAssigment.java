package com.edubridge.assigment;

import java.util.Scanner;

public class FeeCollectionAssigment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int a=6;
		for (int i=1; i<=n;i++)
		{
			a+=5*i;
			System.out.println(a);
		}

	}

}
