package com.Khyati.ExceptionH;

public class ThEx {

	public static void main(String[] args) {
		int i=5;
		try {
		if(i<=10) {
			throw new MyCustomEx("Error");
			
	}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
		
		
}
class MyCustomEx extends Exception{
	
	
	MyCustomEx(String Str){
		
		super(Str);
		
	}
	
	
	
	
	
	
}
