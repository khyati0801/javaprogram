package com.Khyati.MultiT;
class First extends Thread{
	int a;
	
	public void run() {
		
		synchronized(this) {
			
			 System.out.println( Thread.currentThread().getName() + "...starts");
		            try {
		                this.wait();
		            }
		            catch (InterruptedException e) { e.printStackTrace();
		            }
		            System.out.println(Thread.currentThread().getName()+ "...notified");
			
		}
			
		
	}
	
	
}

class Second extends Thread{
	
	First F1;
	Second(First F1){
		
		this.F1=F1;
	}
	
public void run() {
		
		synchronized(this.F1) {
			
			 System.out.println( Thread.currentThread().getName() + "...starts");
	            try {
	                this.F1.wait();
	            }
	            catch (InterruptedException e) { e.printStackTrace();
	            }
	            System.out.println(Thread.currentThread().getName()+ "...notified");
		}
		
	}
	
}

class Third extends Thread{
	First F1;
	Third(First F1){
			this.F1=F1;
	}
	
public void run() {
	synchronized(this.F1) {
		
		 System.out.println( Thread.currentThread().getName() + "...starts");
           this.F1.notify();
           System.out.println(Thread.currentThread().getName()+ "...notified");
	}
	
}
			
	}


public class WaitNotifyEX1 {

	public static void main(String[] args) throws InterruptedException {
		First F1=new First();
		Second s1=new Second(F1);
		Third T1=new Third(F1);
		
		Thread Th1=new Thread(F1,"Thread1");
		Thread Th2=new Thread(s1,"Thread2");
		Thread Th3=new Thread(T1,"Thread3");
		
		Th1.start();
		Th2.start();
		Thread.sleep(500);
		Th3.start();
		
	}

}
