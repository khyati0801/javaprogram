package com.java.ConcurrentMap;

import java.util.ArrayList;
import java.util.Iterator;

public class ConCurException extends Thread{
		static ArrayList<Integer> AL1=new ArrayList<Integer>();
		public void run() {
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {System.out.println("child thread");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			AL1.add(50);
		}
		
	public static void main(String[] args) throws InterruptedException {
		AL1.add(10);
		AL1.add(25);
		AL1.add(30);
		AL1.add(85);
		
		ConCurException t=new ConCurException();
		t.start();
		Iterator i1=AL1.iterator();
		while(i1.hasNext()) {
			
			
			System.out.println(i1.next());
			Thread.sleep(1500);
			
		}
		System.out.println(AL1);
	
	}

}