package com.Khyati.MultiT;

public class ByRunI implements Runnable {
	@Override
	public void run() {
		
		System.out.println("thread inside runnable ");
	}

	public static void main(String[] args) {
		Runnable r=new ByRunI();
		
		Thread t1=new Thread(r,"hello");
		t1.start();
		
		String Str1=t1.getName();
		System.out.println(Str1);
	}

	
	

}
