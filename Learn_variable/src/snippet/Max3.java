package snippet;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 values");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			
			System.out.println(n1+" "+"1st value is max");
		}
		else if(n2>n3){
				System.out.println(n2+" "+"2nd value is max");
		}
			else {
				System.out.println(n3+" "+"3rd value is max");
				
			 }
			
		}
		
		
		
		

	}


