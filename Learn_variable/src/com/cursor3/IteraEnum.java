package com.cursor3;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class IteraEnum {

	public static void main(String[] args) {
		Vector<String> Al=new Vector<String>();
		
		Al.add("pen");
		Al.add("eraser");
		Al.add("ballpen");
		Al.add("sharpner");
		Al.add("scale");
		
		Enumeration E=Al.elements();
		
		while(E.hasMoreElements()) {
			
			System.out.println(E.nextElement());
			
		}
		
		
		

	}

}
