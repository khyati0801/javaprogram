package com.java.collectionsf;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSeteE {
	public static void main(String[] args) {
		TreeSet tl=new TreeSet(new myComparator());
				
				tl.add(10);
				tl.add(0);
				tl.add(15);
				tl.add(20);
				tl.add(20);
				
				System.out.print(tl);
			}
		}
		class myComparator implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				Integer i1=(Integer)o1;
				Integer i2=(Integer)o2;
				return 0;
			//	return -i1.compareTo(i2);
				
				//if(i1<i2) 
				//	return +1;
				//else if(i1>i2)
					
			//		return -1;
				
			//	else 
				
				//return 0;
		}
		}