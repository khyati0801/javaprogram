package com.java.ConcurrentMap;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList2 extends Thread{
	static CopyOnWriteArrayList cowal=new CopyOnWriteArrayList();
	public void run() {
		try {
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread");
		cowal.add(123);
	}
	
	

	public static void main(String[] args) {
		
		cowal.add(456);
		cowal.add(101);
		CopyOnWriteArrayList2 t=new CopyOnWriteArrayList2();
	t.start();
		
		Iterator i1=cowal.iterator();
		while(i1.hasNext()) {
			
			
			System.out.println(i1.next());
			try {
				System.out.println("Main thread");
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(cowal);
		
		
		

	}

}
