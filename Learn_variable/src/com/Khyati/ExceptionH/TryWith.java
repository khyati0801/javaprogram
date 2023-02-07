package com.Khyati.ExceptionH;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWith {

	public static void main(String[] args) throws IOException {
		
		System.out.println("enter the string");
		
		
		try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
		
		
		String str= br.readLine();
		System.out.println(str);
		
		
		

		}

	}
}
