package com.Array.practice;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int b[]=new int[8];
		
		System.arraycopy(a, 1, b, 0, 5);
		for(int i=0;i<=b.length-1;i++) {
		System.out.println(b[i]);
		}
		}

}
