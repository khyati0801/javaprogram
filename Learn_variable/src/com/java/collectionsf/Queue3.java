package com.java.collectionsf;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue3 {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		
		System.out.println(queue);
		queue.offer("Rahul");
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		
		Iterator i=queue.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:"); 
		Iterator i1=queue.iterator();
		while(i1.hasNext()) {
			
			System.out.println(i1.next());
			
		}
	}

}
