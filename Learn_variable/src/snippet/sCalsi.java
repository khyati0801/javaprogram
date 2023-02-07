package snippet;

import java.util.Scanner;

public class sCalsi {
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		
		float a,b;
			
		//menu
		System.out.println("Simple Calculator:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divition");
		System.out.println("5.Modulus");
		
		
		//choice
		System.out.println("Enter enter your choice:");
		int ch=sc.nextInt();
		
		
		//Enter two variables for operation
		System.out.println("Enter Two values");
		a=sc.nextFloat();
		b=sc.nextFloat();
		
		switch(ch) {
		
		case 1: System.out.println("Addition of two numer is"+(a+b));  
	    break;  
	    case 2: System.out.println("Sutraction  of two numer is"+(a-b));  
	    break;  
	    case 3: System.out.println("Multiplication  of two numer is"+(a*b)); 
	    break;
	    case 4: System.out.println("divition of two numer is"+(a/b));  
	    break; 
	    case 5: System.out.println("Modulus of two numer is"+(a%b)); 
	    break;
	    //Default case statement  
	    default:System.out.println("you enter wroung choice");  
		}
		
		
		
		
	}
		
		
		
	}


