package com.java.collectionsf;

import java.util.Comparator;
import java.util.TreeSet;
class tls1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		Integer i1=s1.length();
	    Integer i2=s2.length();
	    
	    if(i1<i2)
	    	return -1;
	    
	    else if(i1>i2)
	    	return +1;
	    else
		return s1.compareTo(s2);
	}
	
	
	 
	
	
	
}

public class TreeSetS {

	public static void main(String[] args) {
TreeSet tls=new TreeSet(new tls1());
		
		tls.add(new StringBuffer("K"));
		tls.add("Jatin");
		tls.add(new StringBuffer("N"));
		tls.add(new StringBuffer("P"));
		tls.add(new StringBuffer("J"));
		tls.add(new StringBuffer("B"));
		
		System.out.print(tls);

	}

}
