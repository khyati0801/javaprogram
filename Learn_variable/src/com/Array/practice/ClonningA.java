package com.Array.practice;

public class ClonningA {

	public static void main(String[] args) {
String a[]= {"1","2","3","4","5","6","7","8","9"};
		
	String b[]=a.clone();
		
		if(a.equals(b)) {
			System.out.println("both are same");
		}
		else {
			
			System.out.println("both are diffrence");
			
		}
		

	}

}
