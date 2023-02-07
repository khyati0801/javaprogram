package com.Array.practice;

import java.util.Scanner;

public class JaggedArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		int a[][]=new int[3][];
		
				
		a[0]=new int[3];
		a[1]=new int[5];
		a[2]=new int[2];

		Class c=a.getClass();  
		String name=c.getName();  
		//printing the class name of Java array   
		System.out.println(name);  
		
		System.out.println("enter the elements");
		for(int i=0;i<3;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				a[i][j]=sc.nextInt();
				
				
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<a[i].length;j++) {
				 
			System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
