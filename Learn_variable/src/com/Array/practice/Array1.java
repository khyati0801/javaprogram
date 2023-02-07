package com.Array.practice;
class Class1{
	
	public void min(int b[])	{
		int min=b[0];
		for(int j=0;j<b.length-1;j++) {
			
			if(min>b[j])  
				  min=b[j];  
				  
				
				
			}
		System.out.println(min);  
		}
		
		
	}

public class Array1 {

	
	public static void main(String[] args) {
		
		Class1 ob=new Class1();
		int a[]= {10,20,30,40,50};
		
		//for(int b:a) {
			
		//	System.out.println(b);
		
	//	}
		ob.min(a);
		}
		
	
	

}
