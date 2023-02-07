package com.java.collectionsf;
  @FunctionalInterface
interface FunI{
	
	void show();	
}
//class FUniimple implements FunI{

//	@Override
//	public void show() {
	//	System.out.println("hi hello");
		
	//}
	
	
	
//}


public class Functionalinter {

	public static void main(String[] args) {
		FunI  ob=() -> System.out.println("hi hello");
		ob.show();
		
	}
}



