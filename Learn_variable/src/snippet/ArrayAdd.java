package snippet;

import java.util.Scanner;

public class ArrayAdd {
	int sum1=0;
	public void AddSum(int ar[],int Sumvalue) {
		
	a:	for(int i=0;i<ar.length;i++) {
			
		b:	for(int j=i+1;j<ar.length;j++) {
				
				//int ts=ar[i]+ar[j];
			
				if(ar[i]+ar[j]==Sumvalue) {
				
				System.out.println(ar[i]+ar[j]);
				System.out.println("index position  of 1st element: "+i+"index position  of 2nd element: "+j);
				
				break a;	
			}
			 	
			}
		
		
	}
	
	}
	public static void main(String args[]) {
		
				ArrayAdd ob1=new ArrayAdd();
				//int a[]= {3,6,2,6,10};
				int n;  
				Scanner sc=new Scanner(System.in);  
				System.out.println("Enter the number of elements you want to store(size): ");  
				n=sc.nextInt();  
				
				System.out.println("Enter the Sum of elements you want to check(total): ");  
				int sum=sc.nextInt();
				int[] array = new int[n];  
				
				System.out.println("Enter the elements of the array: ");  
				for(int i=0; i<n; i++)  
				{  
						//reading array elements from the user   
						array[i]=sc.nextInt();  
				}  
				
				ob1.AddSum(array,sum);
		
				
		
		
	}
}
