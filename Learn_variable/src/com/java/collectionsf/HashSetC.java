package com.java.collectionsf;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetC {

	public static void main(String[] args) {
LinkedHashSet hl=new LinkedHashSet();
		
		hl.add("pen");
		hl.add("eraser");
		hl.add("ballpen");
		hl.add("sharpner");
		hl.add(45);
		hl.add(null);
		hl.add("scale");
		
		System.out.println(hl.add("pen"));
		System.out.println(hl);
	}

}
