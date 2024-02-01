package com.edubridge.OppsConcept;

/*Hiding the implementation detail and showing only essential information to user*/
abstract class Orders{
	public void show() {
		System.out.println("This is show method");
	}
}

class Demo extends Orders{
	
}
public class Test5 {

	public static void main(String[] args) {
		Demo o1=new Demo();
		
		o1.show();

	}

}