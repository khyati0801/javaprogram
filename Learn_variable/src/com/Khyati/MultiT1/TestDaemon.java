package com.Khyati.MultiT1;
class DtestT1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			
			System.out.println("Daemon Thread");
		}
		else {
			
			System.out.println("Normal(user) Thread");
			
			
		}
	
	}
	
}

public class TestDaemon {
	
	
	public static void main(String[] args) {
	   DtestT1 t1=new DtestT1();
		DtestT1 t2=new DtestT1();
		DtestT1 t3=new DtestT1();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
