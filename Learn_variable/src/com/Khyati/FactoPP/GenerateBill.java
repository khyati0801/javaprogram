package com.Khyati.FactoPP;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
	
		GetFactoryPlan g1=new GetFactoryPlan();
		
		System.out.println("enter the plan name");
		Scanner sc=new Scanner(System.in);
		
		
		String Str=sc.next();
		
		
		System.out.println("enter the number of Units:");
		float Unit=sc.nextFloat();		
		
		
		Plan p1=g1.GetPlan(Str);
		
		System.out.println("Bill of Plan  "+" "+Str+"of"+"Units"+Unit+"unit is:");
		p1.getRate();
		p1.CalculateBill(Unit);
		
		
		
		

	}

}
