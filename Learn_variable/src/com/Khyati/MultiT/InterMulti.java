package com.Khyati.MultiT;
class Class1 extends Thread{

		public void run() {
			try {
					for(int i=0;i<=5;i++) {
				
								System.out.println(Thread.currentThread().getName());
								Thread.sleep(1000);
					}
				} 
			    catch (InterruptedException e) {
					System.out.println("interpeted");
					//e.printStackTrace();
				}
			System.out.println("thread is running...");  
				
			}
		
}
public class InterMulti {

	public static void main(String[] args) {
		Class1 ob=new Class1();
		ob.start();
	ob.interrupt();
	}

}
