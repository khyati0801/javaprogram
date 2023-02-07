package com.Array.practice;

import java.util.Scanner;

public class Add2Matrix {

	private static int r;

	public static void main(String[] args) {
		
		System.out.println("enter the size of 2D array1");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of 2D array ROW1:");
		int r=sc.nextInt();
		
		System.out.println("enter the size of 2D array COLUMN1:");
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];
		
		System.out.println("enter the elements");
		
	
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
			a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("enter the size of 2D array2");
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("enter the size of 2D array ROW2:");
		int r1=sc1.nextInt();
		
		System.out.println("enter the size of 2D array COLUMN2:");
		int c1=sc1.nextInt();
		
		int b[][]=new int[r1][c1];
		
	
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
			
			b[i][j]=sc1.nextInt();
			}
			System.out.println();
		}

		int d[][]=new int[3][3];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
			
			d[i][j]=a[i][j]+b[i][j];
			}
			System.out.println();
		}

		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
			
			System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}

	}
	
	
	
	
		
		
		
		
		
		
	}


