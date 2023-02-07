package com.java.collectionsf;

import java.util.Comparator;
import java.util.TreeSet;

class Empoyee implements Comparable{
	int id;
	String Name;
	Empoyee(int id,String Name){
		
		this.id=id;
		this.Name=Name;
		
	}
	public String  toString() {
		return Name+" "+id;
	}
	
	@Override
	public int compareTo(Object o) {
		int id1=id;
		Empoyee e=(Empoyee)o;
		int id2=e.id;
		
		if(id1<id2)
		return -1;
		else if(id1>id2)
		return +1;
		
		else return 0;
	}
	
	
	
}
class Mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Empoyee e1=(Empoyee)o1;
		Empoyee e2=(Empoyee)o2;
		
		String s1=e1.Name;
		String s2=e2.Name;
		
		return s1.compareTo(s2);
		
		
	}
	
	
	
	
}

public class TreeSetDemo4 {

	public static void main(String[] args) {
		Empoyee e1=new Empoyee(1,"kajal");
		Empoyee e2=new Empoyee(2,"rinkal");
		Empoyee e3=new Empoyee(3,"pratik");
		Empoyee e4=new Empoyee(4,"hanika");
		
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		
		System.out.print(t1);
		
		TreeSet t2=new TreeSet(new Mycomparator());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		
		System.out.print(t2);
	}

}
