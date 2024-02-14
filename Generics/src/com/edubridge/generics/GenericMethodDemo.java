package com.edubridge.generics;

public class GenericMethodDemo {
	
	public static <E>void accept(E[]arr){
		for (E itr:arr) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr1= {55,4,67,89,70};
		String[] arr2= {"Reha","Tamana","Mangesh","Ritik","Saniya"};
		System.out.println("First array is : ");
		GenericMethodDemo.accept(arr1);
		
		System.out.println("Second array is : ");
		GenericMethodDemo.accept(arr2);
		

	}

}
