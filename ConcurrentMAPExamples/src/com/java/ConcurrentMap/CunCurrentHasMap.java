package com.java.ConcurrentMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class CunCurrentHasMap {

	public static void main(String[] args) {
		ConcurrentHashMap conhm=new ConcurrentHashMap();
		
		conhm.put(1001, "Binal");
		conhm.put(1002, "Anjali");
		conhm.put(1003, "jignal");
		conhm.put(1004, "Raxil");
		
		System.out.println(conhm);
		
		conhm.putIfAbsent(1005, "mihir");
		System.out.println(conhm);
		
		conhm.remove(1002, "mitali");
		System.out.println(conhm);
		
		conhm.replace(1002, "Anjali", "Mitali");
		System.out.println(conhm);
		
	}

}
