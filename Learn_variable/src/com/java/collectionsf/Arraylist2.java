package com.java.collectionsf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class employee{
	private String Name;
	private long id;
	private int salary;
	
	employee(String Name,int salary,long id){
		
		this.Name=Name;
		this.id=id;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "{" + Name +"," +id+","+salary+ "}";
			
	}
	
}

public class Arraylist2 {

	public static void main(String[] args) {
		Collection<employee> ob=new ArrayList<employee>();
		Collection<employee> ob1=new ArrayList<employee>();
		ob.add(new employee("Nitya", 01, 10000));
		ob.add(new employee("jatin", 02, 11000));
		
		
		
		ob1.add(new employee("Nitya1", 01, 10000));
		ob1.add(new employee("jatin1", 02, 11000));
		
		ob1.addAll(ob);
		Iterator i=ob1.iterator();
		
		
		
		while(i.hasNext()) {
				System.out.print(i.next());
		}

		System.out.println(ob.isEmpty());
		System.out.println(ob1.size());
		
		System.out.println("remove:"+ob1.retainAll(ob));
		
		Iterator i1=ob1.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next());
	}
		System.out.println(ob1.isEmpty());
		System.out.println(ob1.size());
	}

}
