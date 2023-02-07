package com.Khyati.MultiT1;
class Bank extends Thread{
	static int bal=5000;
	static  int withdraw;
	
	Bank(int withdraw)
	{
		
		this.withdraw=withdraw;
		
		
	}
	public static synchronized void Checkbal() {
		
		String name=Thread.currentThread().getName();
		if(withdraw<=bal) {
			
			System.out.println(name+"withdraw money");
			bal=bal-withdraw;
			System.out.println(bal+"balance");
			
			
		}
		else {
			
			System.out.println("insuficent balance");
				
		}
		
	}
	public void run() {
		
		Checkbal();
		
	}
}

public class StaticSynT {

	public static void main(String[] args) {
		
		Bank obj=new Bank(5000);
		
		Thread T1=new Thread(obj);
		Thread T2=new Thread(obj);
		T1.setName("khyati");
		T2.setName("jatin");
		
		T1.start();
		T2.start();
		
Bank obj1=new Bank(5000);
		
		Thread T3=new Thread(obj1);
		Thread T4=new Thread(obj1);
		T3.setName("dipen");
		T4.setName("nitya");
		T3.start();
		T4.start();
		
	}

}
