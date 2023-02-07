package com.Khyati.MultiT;
class TPrigetset extends Thread{
	
	public void run() {
		
		
		System.out.println("thread 1 ");
		try{Thread.sleep(500);} catch(Exception e) {System.out.println(e);}
		
		
	}
	
}
	class TPrigetset1 extends Thread{
		
		public void run() {
			
			
			System.out.println("thread 2 ");
			try{Thread.sleep(500);} catch(Exception e) {System.out.println(e);}
			
			
		}
	
}

public class GetSetP  {

	public static void main(String[] args) {
		TPrigetset t1=new TPrigetset();
		
		TPrigetset1 t2=new TPrigetset1();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t2.setPriority(6);
		
		t1.start();
		t2.start();
		
		System.out.println(t2.currentThread().getPriority());
		
		
	}

}
