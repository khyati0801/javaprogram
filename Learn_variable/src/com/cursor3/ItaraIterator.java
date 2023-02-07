package com.cursor3;

import java.util.ArrayList;
import java.util.Iterator;

public class ItaraIterator {

	public static void main(String[] args) {
ArrayList<String> Al=new ArrayList<String>();
		
		Al.add("pen");
		Al.add("eraser");
		Al.add("ballpen");
		Al.add("sharpner");
		Al.add("scale");
		
		Iterator i=Al.iterator();
		while(i.hasNext())
			
			System.out.println(i.next());
	
		}

}
