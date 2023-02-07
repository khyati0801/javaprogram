package com.Rivet.Recursion;

import java.util.Scanner;

class Rev{
	//static String Str1=null;
  static void  ReverseS(String str1) {
		if(str1==null || str1.length()<=0) {
			 System.out.print(str1);
		}
		else {
		
			System.out.print(str1.charAt(str1.length()-1));
			//System.out.print((str1.length()-1));
			ReverseS(str1.substring(0,str1.length()-1));
			
	
		}
 }
}
public class StrRev {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string:");
		String Str=sc.next();
		
		//String Str="khyati";
		//int l=Str.length();
		
		//System.out.println("string:"+Str);
		
		Rev.ReverseS(Str);
		

	}

}


