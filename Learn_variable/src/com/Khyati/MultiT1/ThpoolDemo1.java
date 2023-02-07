package com.Khyati.MultiT1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThpoolDemo1 {

	public static void main(String[] args) {
		ExecutorService exs=Executors.newFixedThreadPool(5);
		
		for(int i=0;i<=10;i++) {
			
			Runnable r1=new ThreadpooDemo("khyati"+i);
			exs.execute(r1);
			
		}
		exs.shutdown();
		while(!exs.isTerminated()) {
		
		}
		System.out.println("successfully ");
		
	}

}
