package com.Khyati.MultiT1;
class SysS{
	
synchronized public void Display(int n) {
	System.out.println(n);
	for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(n*i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}	

		
	}
	

class Systd extends Thread{
	

	SysS s1;
	Systd(SysS s1){
		
		this.s1=s1;
		
	}
	
     public void run() {
		s1.Display(15);
		
	}
}
  class Systd1 extends Thread{
	  SysS s1;
	  Systd1(SysS s1){
			
			this.s1=s1;
			
		}
         public void run() {
    		s1.Display(120);
    		
    	}
	
	
	
}

public class SysThread  {

	public static void main(String[] args) {
		SysS obj=new SysS();
		Systd T1=new Systd(obj);
		Systd1 T2=new Systd1(obj);
		
		T1.start();
		T2.start();

	}

}
