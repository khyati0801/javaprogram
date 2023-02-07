package com.Khyati.MultiT;
class Nitya extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Nitya");
			try{Thread.sleep(500);} catch(Exception e) {System.out.println(e);}
		}
		
	}
	
	
	
	
}
class Jatin extends Thread{
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Jatin");
			try{Thread.sleep(500);} catch(Exception e) {System.out.println(e);}
			
		}
		
	}
	
}
public class MulEx {

	public static void main(String[] args) throws InterruptedException {
		Nitya n1=new Nitya();
		Jatin j1=new Jatin();
		
		System.out.println(n1.getName());
		System.out.println(j1.getName());
		n1.start();
		
		j1.start();
		
		//n1.setName("khyati1");
	//	System.out.println(n1.getName());
		
		
	//	j1.setName("khyati2");
	//	System.out.println(j1.getName());
		System.out.println(n1.isAlive());
		n1.join(1500);
	j1.join();
		 System.out.println("khyati");
		
	}

}
