package com.java.collectionsf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayIterators {

	

	public static void main(String[] args) {
		ArrayList<String> Al=new ArrayList<String>();
		
		Al.add("pen");
		Al.add("eraser");
		Al.add("ballpen");
		Al.add("sharpner");
		Al.add("scale");
		
		
		//using listiterator
		System.out.println("listiterator");
		ListIterator<String> list1=Al.listIterator(Al.size());  
		while(list1.hasPrevious()) {
			String str=list1.previous();
			System.out.println(str);
		}
		
		//using for loop
		System.out.println("for loop");
		for(int i=0;i<Al.size();i++) {
			System.out.println(Al.get(i));
			
		}
		
		System.out.println("for each");
		Al.forEach(a->{System.out.println(a);});  

		
		System.out.println("for eachRemainig");
		Iterator<String> list=Al.iterator();
		list.forEachRemaining(a->{System.out.println(a);}); 
	}
	
	
	
	
	
	
	
}
