package com.java.collectionsf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArryayList {

	public static void main(String[] args) {
		List<String> coll=new ArrayList<String>();
		
		coll.add("hi");
		coll.add("welcome");
		coll.add("to");
		coll.add("java");
		coll.add("framework");
		
		//System.out.println(coll);
		
		coll.add(4,"collection");
		//System.out.println(coll);
		
		
		Collections.sort(coll);
		
		//coll.forEach(System.out::println);
	//	coll.removeAll(coll);
	///	System.out.println(coll);
	//	System.out.println(coll.contains(coll));
		
		//System.out.println(coll.contains("java"));
		
		//using itarator
		
	//Iterator i=coll.iterator();
	
		
	//	while(i.hasNext()) {
		//	System.out.println(i.next());
	//	}
		
//		for(Object i:coll) {
//			
//			System.out.println(i);
//			
//		}
		Collections.reverse(coll);
     for(Object i:coll) {
			
			System.out.println(i);
			
		}
		
		
	}

	
}
