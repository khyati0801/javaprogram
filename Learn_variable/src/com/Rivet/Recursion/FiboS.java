package com.Rivet.Recursion;

import java.util.Scanner;
class fibo1{
public static void fibonacci(int n1,int n2,int n) {
	
	if(n>0){
		
		
       int n3=n1+n2;
		
		n1=n2;
		n2=n3;
		
     System.out.print(" "+n3);
     
     fibonacci(n1,n2,n-1);
     
		}
}
}

public class FiboS {

	public static void main(String[] args) {

		
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the length of fibbonacci");
		int n=Sc.nextInt();
	
		 int n1=0,n2=1;
		 System.out.print(n1+" "+n2);
		fibo1.fibonacci(n1,n2,n-2);
	}

}
