package com.Khyati.MultiT1;

public class ThreadpooDemo implements Runnable{
  private String name;
  ThreadpooDemo(String name){
	  
	  this.name=name;
	  
  }
  
	@Override
	public void run() {
		
		System.out.println("Thread Started"+name);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread endded"+name);
		
	}
	

	
	
}
