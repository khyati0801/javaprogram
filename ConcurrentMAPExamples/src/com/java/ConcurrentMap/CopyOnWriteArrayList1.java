package com.java.ConcurrentMap;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {

	public static void main(String[] args) {
		CopyOnWriteArrayList l1=new CopyOnWriteArrayList();
		l1.add(456);
		l1.add(456);
		l1.addIfAbsent(456);
		l1.add(10);
		l1.addIfAbsent(456);
		
		System.out.println(l1);
		
		ArrayList<Integer> AL1=new ArrayList<Integer>();
		AL1.add(10);
		AL1.add(25);
		AL1.add(456);
		AL1.add(85);
		
		System.out.println(AL1);
		
		l1.addAllAbsent(AL1);
		System.out.println(l1);
		
		
		
	}

}
