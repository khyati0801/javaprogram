package com.Khyati.MultiT1;
 class DtestT extends Thread{
	public void run() {
	for(int i=0;i<=10;i++) {
		
		System.out.println(Thread.currentThread().getName()+" "+i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	}
	
}

public class DaemonTest {

	public static void main(String[] args) {
		
System.out.println(Thread.currentThread().getName()+"start");
DtestT t1=new DtestT();
//t1.setDaemon(true);
t1.start();
System.out.println(Thread.currentThread().getName()+"end");

	}

}
