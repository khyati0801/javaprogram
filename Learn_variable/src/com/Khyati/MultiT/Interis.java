package com.Khyati.MultiT;
class Class2 extends Thread{
	
	public void  run() {
		
		for(int i=1;i<=5;i++) {
			if(Thread.interrupted()){  
				System.out.println("code for interrupted thread");  
				}  
				else{  
				System.out.println("code for normal thread");  
				}  
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
}

public class Interis {

	public static void main(String[] args) {
	
		Class2 ob=new Class2();
		Class2 ob1=new Class2();
		ob.start();
		ob.interrupt();
		ob1.start();
	}

}
