package com.Array.practice;

public class Array2 {
	
	static int[] get() {
		
		return new int[]{10,20,30};
	}
	

	public static void main(String[] args) {
		int b[]=get();
		
		for(int i=0;i<b.length;i++) {
			
			
			System.out.println(b[i]);
			
		}
	}

}
