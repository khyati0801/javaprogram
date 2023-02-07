package com.Khyati.MultiT;

public class ByExT extends Thread{
	
	public void run() {
		
		System.out.println("Thread is running");
		
	}

	public static void main(String[] args) {
		ByExT ob1=new ByExT();
		ob1.start();
		
		
	}

}
